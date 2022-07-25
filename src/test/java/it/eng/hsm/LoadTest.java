package it.eng.hsm;

import it.eng.hsm.beans.HSMSignatureSession;
import it.eng.hsm.beans.HSMUser;
import it.eng.hsm.util.Utils;
import java.util.Date;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains a main method to verify what the HSM does when the OTP period expires. The method signs the same
 * file an infinite time increasing the waiting interval between one signing and the next one.
 *
 * @author Moretti_Lu
 */
public class LoadTest {

    private final static Logger logger = LoggerFactory.getLogger(LoadTest.class);

    public static void main(String[] args) {
        HSMSignatureSession session = null;
        ClientHSM client = null;
        Date startTime = null;
        byte[] fileToSign = null;
        int counter = 0;

        int one_sec = 1 * 1000;

        logger.info("Avvio test di carico su HSM");
        HSMUser user = new HSMUser("USER", "PASSWORD".toCharArray());
        user.setOTP("OTP".toCharArray());
        try {
            client = HSM.getInstance(TestUtils.ENVIRONMENT_USED);
        } catch (Exception e) {
            logger.error("Errore nell'invocazione del client HSM", e);
            System.exit(-1);
        }

        try {
            fileToSign = IOUtils.toByteArray(Utils.getFileFromResourcesAsStream(TestUtils.TEST_FILE));
        } catch (Exception e) {
            logger.error("Errore nella lettura del file da firmare", e);
            System.exit(-1);
        }

        logger.info("Avvio sessione di firma");
        try {
            session = client.openSignatureSession(user);
            startTime = new Date();
        } catch (Exception e) {
            logger.error("Errore nell'apertura della sessione", e);
            System.exit(-1);
        }

        logger.info("Inizio ciclo di firma...");
        while (true) {
            try {
                client.signP7M(user, fileToSign);
                counter++;

                // Sleep the proces
                Thread.sleep(counter * one_sec);
            } catch (Exception e) {
                Date endTime = new Date();
                long durationMs = endTime.getTime() - startTime.getTime();
                double durationSec = durationMs / 1000;
                double durationMin = durationSec / 60;
                logger.info("Firmati " + counter + " file in " + durationMin + " minuti [" + durationSec + " secondi o "
                        + durationMs + " millisecondi] - dopo la pausa di " + counter + " secondi");

                logger.info("Errore che ha bloccato il ciclo di firma: ", e);
                break;
            }

            logger.info("Firmati " + counter + " file...");
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