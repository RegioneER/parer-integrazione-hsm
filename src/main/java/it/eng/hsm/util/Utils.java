package it.eng.hsm.util;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

/**
 * Class with some utilities
 *
 * @author Moretti_Lu
 *
 */
public class Utils {

    /**
     * Returns the requested file if it belong to the resources otherwise returns <code>null</code>.
     *
     * @param fileName
     *            the filename of the request file
     * 
     * @return
     */
    public static File getFileFromResources(String fileName) {
        File result = null;
        ClassLoader classLoader = Utils.class.getClassLoader();
        URL url = classLoader.getResource(fileName);
        if (url != null) {
            result = new File(url.getFile());
        }
        return result;
    }

    /**
     * Returns the {@link InputStream} of the request file if it belong to the resources otherwise returns
     * <code>null</code>.
     * 
     * @param fileName
     *            the filename of the request file
     * 
     * @return
     */
    public static InputStream getFileFromResourcesAsStream(String fileName) {
        InputStream result = null;
        ClassLoader classLoader = Utils.class.getClassLoader();
        result = classLoader.getResourceAsStream(fileName);
        return result;
    }
}