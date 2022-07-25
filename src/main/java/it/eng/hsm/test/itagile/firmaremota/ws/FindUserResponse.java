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
 *         &lt;element name="findUserReturn" type="{http://ws.firmaremota.itagile.it}UserInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "findUserReturn" })
@XmlRootElement(name = "findUserResponse")
public class FindUserResponse {

    @XmlElement(required = true)
    protected UserInfo findUserReturn;

    /**
     * Gets the value of the findUserReturn property.
     * 
     * @return possible object is {@link UserInfo }
     * 
     */
    public UserInfo getFindUserReturn() {
        return findUserReturn;
    }

    /**
     * Sets the value of the findUserReturn property.
     * 
     * @param value
     *            allowed object is {@link UserInfo }
     * 
     */
    public void setFindUserReturn(UserInfo value) {
        this.findUserReturn = value;
    }
}