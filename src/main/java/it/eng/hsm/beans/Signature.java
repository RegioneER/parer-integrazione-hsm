package it.eng.hsm.beans;

import java.util.Date;

/**
 * Contains the signature informations.
 *
 * @author Moretti_Lu
 *
 */
public abstract class Signature {

    public enum TYPE {
        CADES, PADES, XADES
    }

    public static enum DIGEST_ALGORITH {
        SHA256
    }

    private Certificate certificate;
    private DIGEST_ALGORITH digestAlgorithm;
    private Date signDate;

    /**
     * The byte stream of the signed file.
     */
    private byte[] file;

    /**
     * Constructor for a signature
     * 
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     */
    Signature(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate) {
        this(certificate, digestAlg, signDate, null);
    }

    /**
     * Constructor for a signature.
     * 
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     * @param file
     */
    Signature(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate, byte[] file) {
        if (certificate == null || digestAlg == null) {
            throw new IllegalArgumentException();
        }

        this.certificate = (Certificate) certificate.clone();
        this.digestAlgorithm = digestAlg;

        if (signDate != null) {
            this.signDate = new Date(signDate.getTime());
        }

        this.file = file;
    }

    public abstract TYPE getType();

    public Certificate getCertificate() {
        return certificate;
    }

    public DIGEST_ALGORITH getDigestAlgorithm() {
        return digestAlgorithm;
    }

    public Date getSignDate() {
        return signDate;
    }

    public byte[] getFile() {
        return file;
    }
}