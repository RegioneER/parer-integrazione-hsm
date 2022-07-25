package it.eng.hsm;

import it.eng.hsm.beans.HSMUser;
import java.io.File;
import java.io.IOException;

/**
 * 
 * 
 * @author Moretti_Lu
 */
public class TestUtils {

    static final HSM.AMBIENTE_HSM ENVIRONMENT_USED = HSM.AMBIENTE_HSM.TEST;

    static final String TESTFILE_PATH = "TestFiles/";
    static final String TEST_FILE = TESTFILE_PATH + "fileTest.pdf";

    /**
     * Creates a temporary file (a file that will be deleted at the application closing). Must use only in test!
     *
     * @param fileName
     * 
     * @return
     */
    static File getTempFile(String fileName) {
        File result = null;

        try {
            result = File.createTempFile(fileName, ".tmp");
            result.deleteOnExit();
        } catch (IOException e) {
            result = null;
        }

        return result;
    }

    /**
     * Returns a wrong user to use in test.
     *
     * @return
     */
    static HSMUser getWrongUserTest() {
        HSMUser result = new HSMUser("WrongUser", "00000000".toCharArray());
        result.setOTP("00000000".toCharArray());
        return result;
    }
}