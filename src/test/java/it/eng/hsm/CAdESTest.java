/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna <p/> This program is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the License, or (at your option)
 * any later version. <p/> This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Affero General Public License for more details. <p/> You should
 * have received a copy of the GNU Affero General Public License along with this program. If not,
 * see <https://www.gnu.org/licenses/>.
 */

package it.eng.hsm;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.eng.hsm.beans.HSMSignatureSession;
import it.eng.hsm.beans.HSMUser;
import it.eng.hsm.util.Utils;

/**
 * Contains some functions to test the CAdES signing.
 *
 * @author Moretti_Lu
 *
 */
public class CAdESTest {

    private static final String CAdES_PATH = TestUtils.TESTFILE_PATH + "CAdES/";
    /**
     * File used to signing
     */
    private static final String FILE_CAdES_TEST = TestUtils.TEST_FILE;
    /**
     * Path where main method saves the signature
     */
    private static final String PATH_SIGNATURE = "CAdES_fileSigned_%s.pdf.p7m";

    private static final Logger logger = LoggerFactory.getLogger(CAdESTest.class);

    private static ClientHSM client;
    private static byte[] fileToSign;

    @BeforeAll
    static void init() throws HSMException, IOException {
	client = HSM.getInstance(TestUtils.ENVIRONMENT_USED);

	File file = Utils.getFileFromResources(FILE_CAdES_TEST);
	fileToSign = IOUtils.toByteArray(file.toURI());
    }

    @Test
    void testModuleActive() {
	assertTrue(client.isP7mActive());
    }

    // Test funzione signP7M
    @Test
    void testSignP7M_UserNull() {
	assertThrows(IllegalArgumentException.class, () -> {
	    client.signP7M((HSMUser) null, fileToSign, true);
	});
    }

    @Test
    void testSignP7M_SessionNull() {
	assertThrows(IllegalArgumentException.class, () -> {
	    client.signP7M((HSMSignatureSession) null, fileToSign, true);
	});
    }

    @Test
    void testSignP7M_FileNull() {
	HSMUser user = TestUtils.getWrongUserTest();
	assertThrows(IllegalArgumentException.class, () -> {
	    client.signP7M(user, null, true);
	});
    }

    @Test
    void testSignP7M_WrongUser() {
	HSMUser user = TestUtils.getWrongUserTest();
	assertThrows(AuthenticationException.class, () -> {
	    client.signP7M(user, fileToSign, true);
	});
    }

    /**
     * Signs a test file to P7M signature
     *
     * @param args
     */
    public static void main(String[] args) {
	HSMSignatureSession session = null;
	List<byte[]> signatureP7M = new ArrayList<byte[]>();

	logger.info("Avvio test di firma P7M su HSM");

	HSMUser user = new HSMUser("USER", "PASSWORD".toCharArray());
	user.setOTP("OTP".toCharArray());
	try {
	    init();
	} catch (HSMException e1) {
	    logger.error("Errore nell'invocazione del client HSM", e1);
	    System.exit(-1);
	} catch (IOException e2) {
	    logger.error("Errore nella lettura del file da firmare", e2);
	    System.exit(-1);
	}

	logger.info("Avvio sessione di firma");
	try {
	    session = client.openSignatureSession(user);
	} catch (Exception e) {
	    logger.error("Errore nell'apertura della sessione", e);
	    System.exit(-1);
	}

	// Signs the file sending by parameter the session
	try {
	    byte[] result = client.signP7M(session, fileToSign, true);
	    signatureP7M.add(result);
	    logger.info("File 1 firmato");

	    result = client.signP7M(user, fileToSign, true);
	    signatureP7M.add(result);
	    logger.info("File 2 firmato");
	} catch (AuthenticationException ex) {
	    logger.error("Credenziali errate", ex);
	} catch (OTPException ex) {
	    logger.error("OTP errato", ex);
	} catch (UserBlockedException ex) {
	    logger.error("Utente bloccato", ex);
	} catch (HSMException ex) {
	    logger.error("Errore nell'interazione con HSM", ex);
	} catch (Exception e) {
	    logger.error("Errore generico", e);
	}

	for (int i = 0; i < signatureP7M.size(); i++) {
	    File f = new File(String.format(PATH_SIGNATURE, i + 1));

	    try (FileOutputStream out = new FileOutputStream(f)) {
		out.write(signatureP7M.get(i));
		out.flush();
	    } catch (IOException ex) {
		logger.error("Errore nella memorizzazione del file", ex);
	    }
	}

	logger.info("Chiusura della sessione di firma");
	try {
	    client.closeSignatureSession(session);
	} catch (Exception e) {
	    logger.error("Errore nella chiusura della sessione: ", e);
	} finally {
	    session.cleanSession();
	}
    }
}
