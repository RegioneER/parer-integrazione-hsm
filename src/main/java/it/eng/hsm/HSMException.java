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

/**
 * This {@link Exception} subclass is launched when the HSM don't run correctly.
 *
 * @author Moretti_Lu
 *
 */
public class HSMException extends Exception {

    /*
     * HSM error code.
     */
    private String errorCode;

    /*
     * This constructor will be used when the HSM doesn't return the error code which caused the error.
     * 
     */
    public HSMException() {
        super();
    }

    /*
     * This constructor requires the error code and the exception thrown.
     * 
     * @param errorCode
     * 
     * @param cause
     */
    public HSMException(String errorCode, Throwable cause) {
        super(ErrorUtils.getErrorDescription(errorCode), cause);

        this.errorCode = errorCode;
    }

    /*
     * This constructor requires the error code.
     * 
     * @param errorCode
     */
    public HSMException(String errorCode) {
        this(errorCode, null);
    }

    /*
     * This constructor requires the exception thrown.
     * 
     * @param cause
     */
    public HSMException(Throwable cause) {
        super(cause);
    }

    /*
     * Returns the code of the thrown error.
     * 
     * @return the description of the thrown error
     */
    public String getErrorCode() {
        return errorCode;
    }

    /*
     * Returns the description of the thrown error.
     * 
     * @return the description of the thrown error
     */
    public String getErrorDescription() {
        return ErrorUtils.getErrorDescription(errorCode);
    }
}
