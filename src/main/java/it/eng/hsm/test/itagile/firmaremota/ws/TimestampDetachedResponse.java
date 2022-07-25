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
 *         &lt;element name="timestampDetachedReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "timestampDetachedReturn" })
@XmlRootElement(name = "timestampDetachedResponse")
public class TimestampDetachedResponse {

    @XmlElement(required = true)
    protected byte[] timestampDetachedReturn;

    /**
     * Gets the value of the timestampDetachedReturn property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getTimestampDetachedReturn() {
        return timestampDetachedReturn;
    }

    /**
     * Sets the value of the timestampDetachedReturn property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setTimestampDetachedReturn(byte[] value) {
        this.timestampDetachedReturn = value;
    }
}