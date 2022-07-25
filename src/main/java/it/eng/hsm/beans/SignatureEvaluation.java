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
     * @param invalidSignDescription
     *            If the signature is valid sets <code>null</code>, otherwise the invalidation description
     * @param certificateEvaluation
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