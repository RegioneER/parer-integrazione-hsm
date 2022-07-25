package it.eng.hsm.beans;

import java.util.Date;

/**
 * Contains the CADES signature informations.
 *
 * @author Moretti_Lu
 */
public class SignatureCades extends Signature {

    /**
     * Constructor for a CADES signature
     *
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     */
    public SignatureCades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate) {
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
    public SignatureCades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate, byte[] file) {
        super(certificate, digestAlg, signDate, file);
    }

    @Override
    public TYPE getType() {
        return TYPE.CADES;
    }
}