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
     * @return {@link File} individuato
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
     * @return {@link InputStream} del file individuato
     */
    public static InputStream getFileFromResourcesAsStream(String fileName) {
        InputStream result = null;
        ClassLoader classLoader = Utils.class.getClassLoader();
        result = classLoader.getResourceAsStream(fileName);
        return result;
    }
}
