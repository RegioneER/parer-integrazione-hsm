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
 *         &lt;element name="timestampAttachedReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "timestampAttachedReturn" })
@XmlRootElement(name = "timestampAttachedResponse")
public class TimestampAttachedResponse {

    @XmlElement(required = true)
    protected byte[] timestampAttachedReturn;

    /**
     * Gets the value of the timestampAttachedReturn property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getTimestampAttachedReturn() {
        return timestampAttachedReturn;
    }

    /**
     * Sets the value of the timestampAttachedReturn property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setTimestampAttachedReturn(byte[] value) {
        this.timestampAttachedReturn = value;
    }
}