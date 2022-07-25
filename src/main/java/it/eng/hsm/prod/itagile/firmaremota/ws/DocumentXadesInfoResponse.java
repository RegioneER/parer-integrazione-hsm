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
 *         &lt;element name="documentXadesInfoReturn" type="{http://ws.firmaremota.itagile.it}SignatureDocumentInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "documentXadesInfoReturn" })
@XmlRootElement(name = "documentXadesInfoResponse")
public class DocumentXadesInfoResponse {

    @XmlElement(required = true)
    protected SignatureDocumentInfo documentXadesInfoReturn;

    /**
     * Gets the value of the documentXadesInfoReturn property.
     * 
     * @return possible object is {@link SignatureDocumentInfo }
     * 
     */
    public SignatureDocumentInfo getDocumentXadesInfoReturn() {
        return documentXadesInfoReturn;
    }

    /**
     * Sets the value of the documentXadesInfoReturn property.
     * 
     * @param value
     *            allowed object is {@link SignatureDocumentInfo }
     * 
     */
    public void setDocumentXadesInfoReturn(SignatureDocumentInfo value) {
        this.documentXadesInfoReturn = value;
    }
}