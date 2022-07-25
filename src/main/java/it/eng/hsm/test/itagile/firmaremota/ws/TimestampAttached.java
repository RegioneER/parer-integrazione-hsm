package it.eng.hsm.test.itagile.firmaremota.ws;

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
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="contentInAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "", propOrder = { "cred", "content", "contentInAttachment", "digestAlg" })
@XmlRootElement(name = "timestampAttached")
public class TimestampAttached {

    @XmlElement(required = true)
    protected RemoteSignatureCredentials cred;
    @XmlElement(required = true)
    protected byte[] content;
    protected boolean contentInAttachment;
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
     * Gets the value of the contentInAttachment property.
     * 
     */
    public boolean isContentInAttachment() {
        return contentInAttachment;
    }

    /**
     * Sets the value of the contentInAttachment property.
     * 
     */
    public void setContentInAttachment(boolean value) {
        this.contentInAttachment = value;
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