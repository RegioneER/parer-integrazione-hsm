package it.eng.hsm.beans;

import java.util.Date;

/**
 *
 * @author Moretti_Lu
 */
public class SignaturePades extends Signature {

    private String signatureField;

    /**
     * Constructor for a CADES signature
     *
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     */
    public SignaturePades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate) {
        super(certificate, digestAlg, signDate);
    }

    /**
     * Constructor for a CADES signature.
     *
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     * @param file
     */
    public SignaturePades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate, byte[] file) {
        super(certificate, digestAlg, signDate, file);
    }

    @Override
    public TYPE getType() {
        return TYPE.PADES;
    }

    public String getSignatureField() {
        return signatureField;
    }
}