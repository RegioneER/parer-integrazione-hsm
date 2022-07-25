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
 *         &lt;element name="verifyCertificateAtTimeReturn" type="{http://ws.firmaremota.itagile.it}CertificateStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "verifyCertificateAtTimeReturn" })
@XmlRootElement(name = "verifyCertificateAtTimeResponse")
public class VerifyCertificateAtTimeResponse {

    @XmlElement(required = true)
    protected CertificateStatus verifyCertificateAtTimeReturn;

    /**
     * Gets the value of the verifyCertificateAtTimeReturn property.
     * 
     * @return possible object is {@link CertificateStatus }
     * 
     */
    public CertificateStatus getVerifyCertificateAtTimeReturn() {
        return verifyCertificateAtTimeReturn;
    }

    /**
     * Sets the value of the verifyCertificateAtTimeReturn property.
     * 
     * @param value
     *            allowed object is {@link CertificateStatus }
     * 
     */
    public void setVerifyCertificateAtTimeReturn(CertificateStatus value) {
        this.verifyCertificateAtTimeReturn = value;
    }
}