package it.eng.hsm.prod.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SignatureImage complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureImage", propOrder = { "id", "image", "type" })
public class SignatureImage {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected byte[] image;
    protected int type;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }
}