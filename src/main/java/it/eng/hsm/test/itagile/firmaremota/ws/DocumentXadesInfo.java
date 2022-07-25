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
 *         &lt;element name="signedDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="verifySignatures" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extractContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extractX509" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signedDocument", "verifySignatures", "extractContent", "extractX509" })
@XmlRootElement(name = "documentXadesInfo")
public class DocumentXadesInfo {

    @XmlElement(required = true)
    protected byte[] signedDocument;
    protected boolean verifySignatures;
    protected boolean extractContent;
    protected boolean extractX509;

    /**
     * Gets the value of the signedDocument property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getSignedDocument() {
        return signedDocument;
    }

    /**
     * Sets the value of the signedDocument property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setSignedDocument(byte[] value) {
        this.signedDocument = value;
    }

    /**
     * Gets the value of the verifySignatures property.
     * 
     */
    public boolean isVerifySignatures() {
        return verifySignatures;
    }

    /**
     * Sets the value of the verifySignatures property.
     * 
     */
    public void setVerifySignatures(boolean value) {
        this.verifySignatures = value;
    }

    /**
     * Gets the value of the extractContent property.
     * 
     */
    public boolean isExtractContent() {
        return extractContent;
    }

    /**
     * Sets the value of the extractContent property.
     * 
     */
    public void setExtractContent(boolean value) {
        this.extractContent = value;
    }

    /**
     * Gets the value of the extractX509 property.
     * 
     */
    public boolean isExtractX509() {
        return extractX509;
    }

    /**
     * Sets the value of the extractX509 property.
     * 
     */
    public void setExtractX509(boolean value) {
        this.extractX509 = value;
    }
}