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

/**
 * Contains the informations of signature evaluation.
 *
 * @author Moretti_Lu
 *
 */
public class SignatureEvaluation {

    private Signature signature;
    private String invalidSignDescription;
    private CertificateEvaluation certificateEvaluation;

    /**
     * 
     * @param signature
     *            wrapper firma
     * @param invalidSignDescription
     *            If the signature is valid sets <code>null</code>, otherwise the invalidation description
     * @param certificateEvaluation
     *            wrapper ceritificato
     */
    public SignatureEvaluation(Signature signature, String invalidSignDescription,
            CertificateEvaluation certificateEvaluation) {
        if (signature == null || certificateEvaluation == null) {
            throw new IllegalArgumentException("SignatureEvaluation not correct");
        }

        this.signature = signature;
        this.invalidSignDescription = invalidSignDescription;
        this.certificateEvaluation = certificateEvaluation;
    }

    public Signature getSignature() {
        return signature;
    }

    public String getInvalidSignDescription() {
        return invalidSignDescription;
    }

    public boolean isCorrect() {
        boolean result = false;
        if (this.invalidSignDescription == null) {
            result = true;
        }
        return result;
    }

    public CertificateEvaluation getCertificateStatus() {
        return certificateEvaluation;
    }
}
