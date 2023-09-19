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

package it.eng.hsm.beans;

import java.util.Arrays;

/**
 * This bean contains the user information.
 *
 * @author Moretti_Lu
 *
 */
public class HSMUser {

    private String user;
    private char[] passwd;
    /**
     * One time password
     */
    private char[] otp;

    public HSMUser(String user, char[] passwd) {
        if (user != null && !user.isEmpty()) {
            if (passwd != null && passwd.length > 0) {
                this.user = user;
                this.passwd = passwd;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getUsername() {
        return this.user;
    }

    public char[] getPasswd() {
        return this.passwd;
    }

    public void setOTP(char[] otp) {
        this.otp = otp;
    }

    public char[] getOTP() {
        return this.otp;
    }

    /**
     * Clean the information about password and OTP; this method has to be used when you finished to use credentials.
     * 
     */
    public void cleanUser() {
        Arrays.fill(passwd, '0');
        passwd = null;

        Arrays.fill(otp, '0');
        otp = null;
    }
}
