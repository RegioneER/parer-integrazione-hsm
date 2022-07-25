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
 *         &lt;element name="signPKCS1Return" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signPKCS1Return" })
@XmlRootElement(name = "signPKCS1Response")
public class SignPKCS1Response {

    @XmlElement(required = true)
    protected byte[] signPKCS1Return;

    /**
     * Gets the value of the signPKCS1Return property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getSignPKCS1Return() {
        return signPKCS1Return;
    }

    /**
     * Sets the value of the signPKCS1Return property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setSignPKCS1Return(byte[] value) {
        this.signPKCS1Return = value;
    }
}