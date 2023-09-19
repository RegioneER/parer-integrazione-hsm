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
import it.eng.hsm.test.itagile.firmaremota.ws.RemoteSignatureCredentials;
import it.eng.hsm.test.itagile.firmaremota.ws.RemoteSignatureXadesParams;
import it.eng.hsm.test.itagile.firmaremota.ws.SignatureFlags;
import it.eng.hsm.test.itagile.firmaremota.ws.RemoteSignature;
import it.eng.hsm.test.itagile.firmaremota.ws.RemoteSignatureExceptionException;
import it.eng.hsm.test.itagile.firmaremota.ws.RemoteSignature_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of {@link ClientHSM} for the endpoint of Test RER.
 *
 * @author Moretti_Lu
 *
 */
class ClientHSM_Test implements ClientHSM {

    private final static Logger logger = LoggerFactory.getLogger(ClientHSM_Test.class);

    private RemoteSignature_Service service;
    private RemoteSignature client;

    public ClientHSM_Test() throws HSMException {
        try {
            this.service = new RemoteSignature_Service();
            this.client = this.service.getRemoteSignaturePort();
        } catch (Exception e) {
            throw new HSMException(e);
        }

        logger.info("Client HSM - endpoint TEST");
    }

    /**
     * Returns the respective {@link RemoteSignatureCredentials} of the <code>user</code> (an instance of
     * {@link HSMUser})
     *
     * @param user
     * 
     * @return
     */
    private static RemoteSignatureCredentials getRemoteSignatureCredentials(HSMUser user) {
        RemoteSignatureCredentials credentials = new RemoteSignatureCredentials();
        credentials.setUserid(user.getUsername());
        credentials.setPassword(new String(user.getPasswd()));
        credentials.setExtAuth(new String(user.getOTP()));
        return credentials;
    }

    /**
     * Verifies if the module VERIFY of the HSM is active
     * 
     * @return
     */
    @Override
    public boolean isVerifyActive() {
        boolean result = false;
        try {
            result = client.isModuleActive(Constants.HSM_MODULE.VERIFY.name());
        } catch (Exception e) {
            logger.error("Error in HSM operation", e);
        }
        return result;
    }

    // <editor-fold defaultstate="collapsed" desc="Signature session functions">
    @Override
    public HSMSignatureSession openSignatureSession(HSMUser user) throws HSMException {
        HSMSignatureSession result = null;
        RemoteSignatureCredentials credentials = null;
        String idSession = null;

        if (user == null) {
            throw new IllegalArgumentException();
        }
        credentials = getRemoteSignatureCredentials(user);

        try {
            idSession = client.openSignatureSession(credentials);
            logger.info("Test HSM - session signature opened for " + user.getUsername());
        } catch (RemoteSignatureExceptionException e) {
            String errorCod = e.getMessage();
            if (errorCod != null && !errorCod.isEmpty()) {
                ErrorUtils.throwsHSMException(errorCod);
            }
        } catch (Exception e) {
            throw new HSMException(e);
        }

        if (idSession != null) {
            result = new HSMSignatureSession(user, idSession);
        }

        return result;
    }

    @Override
    public void closeSignatureSession(HSMSignatureSession session) throws HSMException {
        RemoteSignatureCredentials credentials = null;

        if (session == null) {
            throw new IllegalArgumentException();
        }
        credentials = getRemoteSignatureCredentials(session.getUser());

        try {
            client.closeSignatureSession(credentials, session.getSessionToken());
            logger.info("Test HSM - " + session.getUser().getUsername() + "'s session signature closed");
        } catch (Exception e) {
            throw new HSMException(e);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="P7M functions">
    @Override
    public boolean isP7mActive() {
        boolean result = false;
        try {
            result = client.isModuleActive(Constants.HSM_MODULE.SIGN.name());
        } catch (Exception e) {
            logger.error("Error in HSM operation", e);
        }
        return result;
    }

    @Override
    public byte[] signP7M(HSMUser user, byte[] fileToSign) throws HSMException {
        byte[] result = null;

        if (user == null || fileToSign == null) {
            throw new IllegalArgumentException();
        }
        result = signsP7M(getRemoteSignatureCredentials(user), fileToSign);
        return result;
    }

    @Override
    public byte[] signP7M(HSMSignatureSession session, byte[] fileToSign) throws HSMException {
        byte[] result = null;

        if (session == null || fileToSign == null) {
            throw new IllegalArgumentException();
        }
        result = signsP7M(getRemoteSignatureCredentials(session.getUser()), fileToSign);
        return result;
    }

    private byte[] signsP7M(RemoteSignatureCredentials credentials, byte[] fileToSign) throws HSMException {
        byte[] signedBytes = null;

        SignatureFlags flags = new SignatureFlags();
        // No marca temporale
        flags.setTimestamp(false);

        try {
            signedBytes = client.signP7M(credentials, fileToSign, false, false, Constants.DIGEST_TYPE, null, flags);
            logger.debug("Test HSM - " + credentials.getUserid() + " signed a P7M file");
        } catch (RemoteSignatureExceptionException er) {
            String errorCod = er.getMessage();

            ErrorUtils.throwsHSMException(errorCod);
        } catch (Exception e) {
            throw new HSMException(e);
        }

        return signedBytes;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="XAdES functions">
    private static ConfigurationXAdES getDefaultConfigurationXAdES() {
        return new ConfigurationXAdES(XAdES.PROFILES.BES, XAdES.TYPE.DETACHED, XAdES.VALIDATION.T);
    }

    @Override
    public boolean isXAdESActive() {
        boolean result = false;
        try {
            result = client.isModuleActive(Constants.HSM_MODULE.SIGN.name());
        } catch (Exception e) {
            logger.error("Error in HSM operation", e);
        }
        return result;
    }

    @Override
    public byte[] signXAdES(HSMUser user, byte[] fileToSign) throws HSMException {

        byte[] result = null;

        if (user == null || fileToSign == null) {
            throw new IllegalArgumentException();
        }

        result = signsXAdES(getRemoteSignatureCredentials(user), fileToSign, getDefaultConfigurationXAdES());
        return result;
    }

    @Override
    public byte[] signXAdES(HSMUser user, byte[] fileToSign, ConfigurationXAdES conf) throws HSMException {
        byte[] result = null;

        if (user == null || fileToSign == null) {
            throw new IllegalArgumentException();
        }

        result = signsXAdES(getRemoteSignatureCredentials(user), fileToSign, conf);
        return result;
    }

    @Override
    public byte[] signXAdES(HSMSignatureSession session, byte[] fileToSign) throws HSMException {
        byte[] result = null;

        if (session == null || fileToSign == null) {
            throw new IllegalArgumentException();
        }

        result = signsXAdES(getRemoteSignatureCredentials(session.getUser()), fileToSign,
                getDefaultConfigurationXAdES());
        return result;
    }

    @Override
    public byte[] signXAdES(HSMSignatureSession session, byte[] fileToSign, ConfigurationXAdES conf)
            throws HSMException {
        byte[] result = null;

        if (session == null || fileToSign == null) {
            throw new IllegalArgumentException();
        }

        result = signsXAdES(getRemoteSignatureCredentials(session.getUser()), fileToSign, conf);
        return result;
    }

    private byte[] signsXAdES(RemoteSignatureCredentials credentials, byte[] fileToSign, ConfigurationXAdES conf)
            throws HSMException {
        RemoteSignatureXadesParams params = new RemoteSignatureXadesParams();
        byte[] signedBytes = null;

        if (conf != null) {
            params.setForm(conf.getProfile() != null ? conf.getProfile().name() : null);
            params.setType(conf.getType() != null ? conf.getType().name() : null);
            params.setValidationData(conf.getValidation() != null ? conf.getValidation().name() : null);

            // Utilizza Signature come id della firma
            params.setSignatureId(null);

            // Firma tutto il file
            params.setElemenXPath(null);
        }

        try {
            signedBytes = client.signXAdES(credentials, fileToSign, Constants.DIGEST_TYPE, null, params);
            logger.debug("Test HSM - " + credentials.getUserid() + " signed a XAdES file");
        } catch (RemoteSignatureExceptionException er) {
            String errorCod = er.getMessage();

            ErrorUtils.throwsHSMException(errorCod);
        } catch (Exception e) {
            throw new HSMException(e);
        }

        return signedBytes;
    }

    // private byte[] signsPAdES(RemoteSignatureCredentials credentials, byte[] fileToSign) throws HSMException {
    // byte[] signedBytes = null;
    //
    // SignatureFlags flags = new SignatureFlags();
    //
    // flags.setCosignCoordinates(true);
    // flags.setCounterSignaturePath(null);
    // flags.setGraphicalSignature(true);
    // flags.setPassword(null);
    // flags.setPdfSignatureCertificationLevel(value);
    // flags.setPdfSignatureLayout(value);
    //
    // flags.setOcsp(true);
    // flags.setTimestamp(true);
    //
    //
    // flags.setTimestampCode(null);
    //
    //
    // try {
    // signedBytes = client.signP7M(credentials, fileToSign, false, false, Constants.DIGEST_TYPE, null, flags);
    // } catch (RemoteSignatureExceptionException er) {
    // String errorCod = er.getMessage();
    //
    // ErrorUtils.throwsHSMException(errorCod);
    // } catch (Exception e) {
    // throw new HSMException(e);
    // }
    //
    // return signedBytes;
    // }

    // </editor-fold>
}
