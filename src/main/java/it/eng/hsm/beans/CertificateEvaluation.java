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

import java.util.Date;

/**
 * This bean contains the informations of certificate evaluation.
 *
 * @author Moretti_Lu
 *
 */
public class CertificateEvaluation {

    private Certificate certificate;
    private Date verifyDate;
    private String invalidDescription;
    private String untrustDescription;

    /**
     * 
     * @param certificate
     *            certificato di firma
     * @param verifyDate
     *            data di verifica
     * @param invalidDesciption
     *            If the certificate is valid sets <code>null</code>, otherwise the invalidation description
     * @param untrustDescription
     *            If the certificate is trusted sets <code>null</code>, otherwise the untrusted description
     */
    public CertificateEvaluation(Certificate certificate, Date verifyDate, String invalidDesciption,
            String untrustDescription) {
        if (certificate == null || verifyDate == null) {
            throw new IllegalArgumentException("CertificateEvaluation not correct");
        }

        this.certificate = certificate;
        this.verifyDate = new Date(verifyDate.getTime());
        this.invalidDescription = invalidDesciption;
        this.untrustDescription = untrustDescription;
    }

    public Certificate getCertificate() {
        return (Certificate) certificate.clone();
    }

    public Date getVerifyDate() {
        return new Date(verifyDate.getTime());
    }

    public String getInvalidDescription() {
        return invalidDescription;
    }

    public boolean isValid() {
        boolean result = false;
        if (invalidDescription == null) {
            result = true;
        }
        return result;
    }

    public String getUntrustDescription() {
        return untrustDescription;
    }

    public boolean isTrust() {
        boolean result = false;
        if (untrustDescription == null) {
            result = true;
        }
        return result;
    }
}
