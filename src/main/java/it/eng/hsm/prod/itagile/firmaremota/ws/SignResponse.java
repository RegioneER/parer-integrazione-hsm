package it.eng.hsm.prod.itagile.firmaremota.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for signResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signResponse", propOrder = { "signReturn" })
public class SignResponse {

    @XmlElementRef(name = "signReturn", namespace = "http://ws.firmaremota.itagile.it", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> signReturn;

    /**
     * Gets the value of the signReturn property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    public JAXBElement<byte[]> getSignReturn() {
        return signReturn;
    }

    /**
     * Sets the value of the signReturn property.
     * 
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    public void setSignReturn(JAXBElement<byte[]> value) {
        this.signReturn = value;
    }
}