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
     * @param verifyDate
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