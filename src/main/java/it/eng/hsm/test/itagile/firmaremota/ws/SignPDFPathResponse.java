package it.eng.hsm.test.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="signPDFPathReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signPDFPathReturn" })
@XmlRootElement(name = "signPDFPathResponse")
public class SignPDFPathResponse {

    protected int signPDFPathReturn;

    /**
     * Gets the value of the signPDFPathReturn property.
     * 
     */
    public int getSignPDFPathReturn() {
        return signPDFPathReturn;
    }

    /**
     * Sets the value of the signPDFPathReturn property.
     * 
     */
    public void setSignPDFPathReturn(int value) {
        this.signPDFPathReturn = value;
    }
}