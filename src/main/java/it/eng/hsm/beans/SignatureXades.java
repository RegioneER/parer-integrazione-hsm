package it.eng.hsm.beans;

import java.util.Date;

/**
 * Contains the XADES signature informations.
 *
 * @author Moretti_Lu
 */
public class SignatureXades extends Signature {

    /**
     * Constructor for a XADES signature
     *
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     */
    public SignatureXades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate) {
        super(certificate, digestAlg, signDate);
    }

    /**
     * Constructor for a XADES signature.
     *
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     * @param file
     */
    public SignatureXades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate, byte[] file) {
        super(certificate, digestAlg, signDate, file);
    }

    @Override
    public TYPE getType() {
        return TYPE.XADES;
    }
}