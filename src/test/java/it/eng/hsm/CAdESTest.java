/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.hsm;

import it.eng.hsm.beans.HSMSignatureSession;
import it.eng.hsm.beans.HSMUser;
import it.eng.hsm.util.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private final static Logger logger = LoggerFactory.getLogger(CAdESTest.class);

    private static ClientHSM client;
    private static byte[] fileToSign;

    @BeforeClass
    public static void init() throws HSMException, IOException {
        client = HSM.getInstance(TestUtils.ENVIRONMENT_USED);

        File file = Utils.getFileFromResources(FILE_CAdES_TEST);
        fileToSign = IOUtils.toByteArray(file.toURI());
    }

    @Test
    public void testModuleActive() {
        Assert.assertTrue(client.isP7mActive());
    }

    // Test funzione signP7M
    @Test(expected = IllegalArgumentException.class)
    public void testSignP7M_UserNull() throws HSMException {
        client.signP7M((HSMUser) null, fileToSign, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSignP7M_SessionNull() throws HSMException {
        client.signP7M((HSMSignatureSession) null, fileToSign, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSignP7M_FileNull() throws HSMException {
        client.signP7M(TestUtils.getWrongUserTest(), null, true);
    }

    @Test(expected = AuthenticationException.class)
    public void testSignP7M_WrongUser() throws HSMException {
        client.signP7M(TestUtils.getWrongUserTest(), fileToSign, true);
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
