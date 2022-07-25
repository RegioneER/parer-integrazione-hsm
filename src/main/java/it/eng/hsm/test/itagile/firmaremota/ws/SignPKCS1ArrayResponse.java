package it.eng.hsm.test.itagile.firmaremota.ws;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="signPKCS1ArrayReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signPKCS1ArrayReturn" })
@XmlRootElement(name = "signPKCS1ArrayResponse")
public class SignPKCS1ArrayResponse {

    @XmlElement(required = true)
    protected List<byte[]> signPKCS1ArrayReturn;

    /**
     * Gets the value of the signPKCS1ArrayReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the signPKCS1ArrayReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSignPKCS1ArrayReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list byte[]
     * 
     */
    public List<byte[]> getSignPKCS1ArrayReturn() {
        if (signPKCS1ArrayReturn == null) {
            signPKCS1ArrayReturn = new ArrayList<byte[]>();
        }
        return this.signPKCS1ArrayReturn;
    }
}