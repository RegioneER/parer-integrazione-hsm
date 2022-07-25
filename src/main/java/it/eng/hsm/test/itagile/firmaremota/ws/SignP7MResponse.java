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
 *         &lt;element name="signP7MReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signP7MReturn" })
@XmlRootElement(name = "signP7MResponse")
public class SignP7MResponse {

    @XmlElement(required = true)
    protected byte[] signP7MReturn;

    /**
     * Gets the value of the signP7MReturn property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getSignP7MReturn() {
        return signP7MReturn;
    }

    /**
     * Sets the value of the signP7MReturn property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setSignP7MReturn(byte[] value) {
        this.signP7MReturn = value;
    }
}