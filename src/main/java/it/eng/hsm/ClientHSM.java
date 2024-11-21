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

import it.eng.hsm.beans.ConfigurationXAdES;
import it.eng.hsm.beans.HSMSignatureSession;
import it.eng.hsm.beans.HSMUser;

/**
 * Functions that a <code>ClientHSM</code> implementation must offer.
 *
 * @author Moretti_Lu
 *
 */
public interface ClientHSM {

    public boolean isVerifyActive();

    // <editor-fold defaultstate="collapsed" desc="Signature session">
    /**
     * Function to open a signature session
     *
     * @param user
     *            utente HSM
     * 
     * @return sessione con servizio HSM
     * 
     * @throws AuthenticationException
     *             if the user credentials aren't correct
     * @throws OTPException
     *             if the OTP value isn't correct
     * @throws UserBlockedException
     *             if the user is blocked
     * @throws HSMException
     *             if a generic error occurs
     */
    public HSMSignatureSession openSignatureSession(HSMUser user)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException;

    /**
     * Function to close the signature session
     *
     * @param session
     *            sesione operativa HSM
     * 
     * @throws it.eng.hsm.HSMException
     *             eccezione generica
     */
    public void closeSignatureSession(HSMSignatureSession session) throws HSMException;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="P7M functions">
    public boolean isP7mActive();

    /**
     * Realizes the CAdES signature of the <code>fileToSign</code> with the certificate of the <code>user</code>.
     *
     * @param user
     *            the user who requires the signature
     * @param fileToSign
     *            file to sign
     * 
     * @return array di byte del documento P7M firmato
     * 
     * @throws AuthenticationException
     *             if the user credentials aren't correct
     * @throws OTPException
     *             if the OTP value isn't correct
     * @throws UserBlockedException
     *             if the user is blocked
     * @throws HSMException
     *             if a generic error occurs
     */
    public byte[] signP7M(HSMUser user, byte[] fileToSign)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException;

    /**
     * Realizes the CAdES signature of the <code>fileToSign</code> with the certificate of the <code>user</code>.
     * 
     * @param session
     *            the signature session has to be previously opened
     * @param fileToSign
     *            file to sign
     * 
     * @return array di byte del documento P7M firmato
     * 
     * @throws AuthenticationException
     *             if the user credentials aren't correct
     * @throws OTPException
     *             if the OTP value isn't correct
     * @throws UserBlockedException
     *             if the user is blocked
     * @throws HSMException
     *             if a generic error occurs
     */
    public byte[] signP7M(HSMSignatureSession session, byte[] fileToSign)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="XAdES functions">
    public boolean isXAdESActive();

    /**
     * Realizes the XAdES-T signature of the <code>fileToSign</code> with the certificate of the <code>user</code>.
     * 
     * @param user
     *            the user who requires the signature
     * @param fileToSign
     *            file to sign
     * @param marcaTemporale
     *            marca temporale si/no
     * 
     * @return array di byte del documento XADES firmato
     * 
     * @throws AuthenticationException
     *             if the user credentials aren't correct
     * @throws OTPException
     *             if the OTP value isn't correct
     * @throws UserBlockedException
     *             if the user is blocked
     * @throws HSMException
     *             if a generic error occurs
     */
    public byte[] signXAdES(HSMUser user, byte[] fileToSign, boolean marcaTemporale)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException;

    /**
     * Realizes the XAdES signature of the <code>fileToSign</code> with the certificate of the <code>user</code>.
     * 
     * @param user
     *            the user who requires the signature
     * @param fileToSign
     *            file to sign
     * @param conf
     *            configurazione XADES
     * 
     * @return array di byte del documento XADES firmato
     * 
     * @throws AuthenticationException
     *             if the user credentials aren't correct
     * @throws OTPException
     *             if the OTP value isn't correct
     * @throws UserBlockedException
     *             if the user is blocked
     * @throws HSMException
     *             if a generic error occurs
     */
    public byte[] signXAdES(HSMUser user, byte[] fileToSign, ConfigurationXAdES conf)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException;

    /**
     * Realizes the XAdES-T signature of the <code>fileToSign</code> with the certificate of the <code>user</code>.
     * 
     * @param session
     *            the signature session has to be previously opened
     * @param fileToSign
     *            file to sign
     * @param marcaTemporale
     *            marca temporale si/no
     * 
     * @return array di byte del documento XADES firmato
     * 
     * @throws AuthenticationException
     *             if the user credentials aren't correct
     * @throws OTPException
     *             if the OTP value isn't correct
     * @throws UserBlockedException
     *             if the user is blocked
     * @throws HSMException
     *             if a generic error occurs
     */
    public byte[] signXAdES(HSMSignatureSession session, byte[] fileToSign, boolean marcaTemporale)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException;

    /**
     * Realizes the XAdES signature of the <code>fileToSign</code> with the certificate of the <code>user</code>.
     * 
     * @param session
     *            the signature session has to be previously opened
     * @param fileToSign
     *            file to sign
     * @param conf
     *            configurazione XADES
     * 
     * @return array di byte del documento XADES firmato
     * 
     * @throws AuthenticationException
     *             if the user credentials aren't correct
     * @throws OTPException
     *             if the OTP value isn't correct
     * @throws UserBlockedException
     *             if the user is blocked
     * @throws HSMException
     *             if a generic error occurs
     */
    public byte[] signXAdES(HSMSignatureSession session, byte[] fileToSign, ConfigurationXAdES conf)
            throws AuthenticationException, OTPException, UserBlockedException, HSMException;
    // </editor-fold>
}
