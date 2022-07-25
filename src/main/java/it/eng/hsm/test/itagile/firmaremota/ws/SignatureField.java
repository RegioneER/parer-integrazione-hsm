package it.eng.hsm.test.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SignatureField complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="position" type="{http://ws.firmaremota.itagile.it}ArrayOfPosition"/>
 *         &lt;element name="pageH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="signer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureField", propOrder = { "name", "signed", "page", "position", "pageH", "visible", "signer",
        "location", "reason" })
public class SignatureField {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean signed;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer page;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosition position;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pageH;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean visible;
    @XmlElement(required = true, nillable = true)
    protected String signer;
    @XmlElement(required = true, nillable = true)
    protected String location;
    @XmlElement(required = true, nillable = true)
    protected String reason;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the signed property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isSigned() {
        return signed;
    }

    /**
     * Sets the value of the signed property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setSigned(Boolean value) {
        this.signed = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return possible object is {@link ArrayOfPosition }
     * 
     */
    public ArrayOfPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *            allowed object is {@link ArrayOfPosition }
     * 
     */
    public void setPosition(ArrayOfPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the pageH property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getPageH() {
        return pageH;
    }

    /**
     * Sets the value of the pageH property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setPageH(Integer value) {
        this.pageH = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the signer property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSigner() {
        return signer;
    }

    /**
     * Sets the value of the signer property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSigner(String value) {
        this.signer = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReason(String value) {
        this.reason = value;
    }
}