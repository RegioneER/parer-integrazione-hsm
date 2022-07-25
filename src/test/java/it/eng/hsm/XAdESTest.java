package it.eng.hsm;

import it.eng.hsm.beans.ConfigurationXAdES;
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
 * Contains some functions to test the XAdES signing.
 *
 * @author Moretti_Lu
 *
 */
public class XAdESTest {

    private static final String XAdES_PATH = TestUtils.TESTFILE_PATH + "XAdES/";
    /**
     * File used to signing
     */
    private static final String FILE_XAdES_TEST = XAdES_PATH + "XADES_toSign.xml";
    /**
     * Path where main method saves the signature
     */
    private static final String PATH_SIGNATURE = "XAdES_fileSigned_%s.xml";

    private final static Logger logger = LoggerFactory.getLogger(XAdESTest.class);

    private static ClientHSM client;
    private static byte[] fileToSign;

    @BeforeClass
    public static void init() throws HSMException, IOException {
        client = HSM.getInstance(TestUtils.ENVIRONMENT_USED);

        File file = Utils.getFileFromResources(FILE_XAdES_TEST);
        fileToSign = IOUtils.toByteArray(file.toURI());
    }

    @Test
    public void testModuleActive() {
        Assert.assertTrue(client.isXAdESActive());
    }

    // Test funzione signXAdES
    @Test(expected = IllegalArgumentException.class)
    public void testSignXAdES_UserNull() throws HSMException {
        client.signXAdES((HSMUser) null, fileToSign, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSignXAdES_SessionNull() throws HSMException {
        client.signXAdES((HSMSignatureSession) null, fileToSign, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSignXAdES_FileNull() throws HSMException {
        client.signXAdES(TestUtils.getWrongUserTest(), null, null);
    }

    @Test(expected = AuthenticationException.class)
    public void testSignXAdES_WrongUser() throws HSMException {
        client.signXAdES(TestUtils.getWrongUserTest(), fileToSign, null);
    }

    /**
     * Signs a test file to XAdES signature
     * 
     * @param args
     */
    public static void main(String[] args) {
        HSMSignatureSession session = null;
        List<byte[]> signatureXAdES = new ArrayList<byte[]>();

        logger.info("Avvio test di firma XAdES su HSM");

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
            ConfigurationXAdES conf = new ConfigurationXAdES(XAdES.PROFILES.BES, XAdES.TYPE.ENVELOPED, null);
            byte[] result = client.signXAdES(session, fileToSign, conf);
            signatureXAdES.add(result);
            logger.info("File 1 firmato");

            conf = new ConfigurationXAdES(XAdES.PROFILES.BES, XAdES.TYPE.ENVELOPING, null);
            result = client.signXAdES(user, fileToSign, conf);
            signatureXAdES.add(result);
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

        for (int i = 0; i < signatureXAdES.size(); i++) {
            File f = new File(String.format(PATH_SIGNATURE, i + 1));

            try (FileOutputStream out = new FileOutputStream(f)) {
                out.write(signatureXAdES.get(i));
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