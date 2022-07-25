package it.eng.hsm.test.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element name="certBuf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="checkTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "certBuf", "checkTime" })
@XmlRootElement(name = "verifyCertificateAtTime")
public class VerifyCertificateAtTime {

    @XmlElement(required = true)
    protected byte[] certBuf;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkTime;

    /**
     * Gets the value of the certBuf property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getCertBuf() {
        return certBuf;
    }

    /**
     * Sets the value of the certBuf property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setCertBuf(byte[] value) {
        this.certBuf = value;
    }

    /**
     * Gets the value of the checkTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getCheckTime() {
        return checkTime;
    }

    /**
     * Sets the value of the checkTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setCheckTime(XMLGregorianCalendar value) {
        this.checkTime = value;
    }
}