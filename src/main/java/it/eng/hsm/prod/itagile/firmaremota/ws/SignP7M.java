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
 *         &lt;element name="signatureCred" type="{http://ws.firmaremota.itagile.it}RemoteSignatureCredentials"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="contentInAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="p7m" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="digestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X509certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="flags" type="{http://ws.firmaremota.itagile.it}SignatureFlags"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signatureCred", "content", "contentInAttachments", "p7M", "digestType",
        "x509Certificate", "flags" })
@XmlRootElement(name = "signP7M")
public class SignP7M {

    @XmlElement(required = true)
    protected RemoteSignatureCredentials signatureCred;
    @XmlElement(required = true)
    protected byte[] content;
    protected boolean contentInAttachments;
    @XmlElement(name = "p7m")
    protected boolean p7M;
    @XmlElement(required = true)
    protected String digestType;
    @XmlElement(name = "X509certificate", required = true)
    protected byte[] x509Certificate;
    @XmlElement(required = true)
    protected SignatureFlags flags;

    /**
     * Gets the value of the signatureCred property.
     * 
     * @return possible object is {@link RemoteSignatureCredentials }
     * 
     */
    public RemoteSignatureCredentials getSignatureCred() {
        return signatureCred;
    }

    /**
     * Sets the value of the signatureCred property.
     * 
     * @param value
     *            allowed object is {@link RemoteSignatureCredentials }
     * 
     */
    public void setSignatureCred(RemoteSignatureCredentials value) {
        this.signatureCred = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentInAttachments property.
     * 
     */
    public boolean isContentInAttachments() {
        return contentInAttachments;
    }

    /**
     * Sets the value of the contentInAttachments property.
     * 
     */
    public void setContentInAttachments(boolean value) {
        this.contentInAttachments = value;
    }

    /**
     * Gets the value of the p7M property.
     * 
     */
    public boolean isP7M() {
        return p7M;
    }

    /**
     * Sets the value of the p7M property.
     * 
     */
    public void setP7M(boolean value) {
        this.p7M = value;
    }

    /**
     * Gets the value of the digestType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDigestType() {
        return digestType;
    }

    /**
     * Sets the value of the digestType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDigestType(String value) {
        this.digestType = value;
    }

    /**
     * Gets the value of the x509Certificate property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Sets the value of the x509Certificate property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setX509Certificate(byte[] value) {
        this.x509Certificate = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return possible object is {@link SignatureFlags }
     * 
     */
    public SignatureFlags getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *            allowed object is {@link SignatureFlags }
     * 
     */
    public void setFlags(SignatureFlags value) {
        this.flags = value;
    }
}