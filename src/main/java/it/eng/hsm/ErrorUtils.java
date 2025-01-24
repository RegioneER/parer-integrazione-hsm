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

import it.eng.hsm.util.Utils;
import java.io.InputStream;
import java.util.MissingResourceException;
import java.util.Properties;

/**
 * Utility to obtain the error informations
 *
 * @author Moretti_Lu
 *
 */
class ErrorUtils {
    /**
     * This file contains the mapping between the description and the code of the HSM error.
     */
    private static final String ERROR_FILE = "ErrorCod.properties";

    private static final Properties errorMapping;

    /**
     * The HSM code of the authentication error.
     */
    public static final String AUTH_EXCEPTION_COD = "010";
    /**
     * The HSM code of the strong authentication error.
     */
    public static final String OTP_EXCEPTION_COD = "019";
    /**
     * The HSM code of the strong authentication error.
     */
    public static final String USR_BLOCKED_EXCEPTION_COD = "027";

    public static final String UNKNOWN_ERROR = "HSM unknown error";

    static {
        errorMapping = new Properties();
        initErrorMapping();
    }

    private static void initErrorMapping() {
        try (InputStream input = Utils.getFileFromResourcesAsStream(ERROR_FILE)) {
            errorMapping.load(input);
        } catch (Exception e) {
            throw new MissingResourceException("The file \"" + ERROR_FILE + "\" is not readable", null, null);
        }
    }

    /**
     * Returns the description of the error, otherwise returns <code>UNKNOWN_ERROR</code>.
     *
     * @param errorCod
     *
     * @return
     */
    public static String getErrorDescription(String errorCod) {
        String result = null;
        if (errorCod != null) {
            result = errorMapping.getProperty(errorCod);
        }
        if (result == null) {
            result = UNKNOWN_ERROR;
        }

        return result;
    }

    /**
     * Launches the correct exception after an HSM error.
     *
     * @param errorCod
     *
     * @throws AuthenticationException
     * @throws OTPException
     * @throws HSMException
     */
    public static void throwsHSMException(String errorCod)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException {
        if (errorCod != null && !errorCod.isEmpty()) {
            switch (errorCod) {
            case AUTH_EXCEPTION_COD:
                throw new AuthenticationException();
            case OTP_EXCEPTION_COD:
                throw new OTPException();
            case USR_BLOCKED_EXCEPTION_COD:
                throw new UserBlockedException();

            default:
                throw new HSMException(errorCod);
            }
        }

        throw new HSMException();
    }
}
