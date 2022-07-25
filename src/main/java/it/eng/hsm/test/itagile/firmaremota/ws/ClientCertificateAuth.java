package it.eng.hsm.test.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClientCertificateAuth complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientCertificateAuth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientCertificateAuth", propOrder = { "certificate", "signature", "timestamp" })
public class ClientCertificateAuth {

    @XmlElement(required = true, nillable = true)
    protected byte[] certificate;
    @XmlElement(required = true, nillable = true)
    protected byte[] signature;
    @XmlElement(required = true, nillable = true)
    protected byte[] timestamp;

    /**
     * Gets the value of the certificate property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setCertificate(byte[] value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setTimestamp(byte[] value) {
        this.timestamp = value;
    }
}