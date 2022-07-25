package it.eng.hsm.test.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Signatures complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Signatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signatures" type="{http://ws.firmaremota.itagile.it}ArrayOfSignature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signatures", propOrder = { "signatures" })
public class Signatures {

    @XmlElement(required = true)
    protected ArrayOfSignature signatures;

    /**
     * Gets the value of the signatures property.
     * 
     * @return possible object is {@link ArrayOfSignature }
     * 
     */
    public ArrayOfSignature getSignatures() {
        return signatures;
    }

    /**
     * Sets the value of the signatures property.
     * 
     * @param value
     *            allowed object is {@link ArrayOfSignature }
     * 
     */
    public void setSignatures(ArrayOfSignature value) {
        this.signatures = value;
    }
}