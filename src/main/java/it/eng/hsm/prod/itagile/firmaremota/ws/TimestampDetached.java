package it.eng.hsm.prod.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cred" type="{http://ws.firmaremota.itagile.it}RemoteSignatureCredentials"/>
 *         &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="digestAlg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cred", "digest", "digestAlg" })
@XmlRootElement(name = "timestampDetached")
public class TimestampDetached {

    @XmlElement(required = true)
    protected RemoteSignatureCredentials cred;
    @XmlElement(required = true)
    protected byte[] digest;
    @XmlElement(required = true)
    protected String digestAlg;

    /**
     * Gets the value of the cred property.
     * 
     * @return possible object is {@link RemoteSignatureCredentials }
     * 
     */
    public RemoteSignatureCredentials getCred() {
        return cred;
    }

    /**
     * Sets the value of the cred property.
     * 
     * @param value
     *            allowed object is {@link RemoteSignatureCredentials }
     * 
     */
    public void setCred(RemoteSignatureCredentials value) {
        this.cred = value;
    }

    /**
     * Gets the value of the digest property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setDigest(byte[] value) {
        this.digest = value;
    }

    /**
     * Gets the value of the digestAlg property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDigestAlg() {
        return digestAlg;
    }

    /**
     * Sets the value of the digestAlg property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDigestAlg(String value) {
        this.digestAlg = value;
    }
}