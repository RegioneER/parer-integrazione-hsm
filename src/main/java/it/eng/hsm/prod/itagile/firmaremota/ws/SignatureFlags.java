package it.eng.hsm.prod.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SignatureFlags complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureFlags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="counterSignaturePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="graphicalSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ocsp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cosignCoordinates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timestampCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdfSignatureLayout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdfSignatureCertificationLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cadesDetached" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureFlags", propOrder = { "counterSignaturePath", "graphicalSignature", "ocsp", "timestamp",
        "cosignCoordinates", "timestampCode", "pdfSignatureLayout", "password", "pdfSignatureCertificationLevel",
        "cadesDetached" })
public class SignatureFlags {

    @XmlElement(required = true, nillable = true)
    protected String counterSignaturePath;
    protected boolean graphicalSignature;
    protected boolean ocsp;
    protected boolean timestamp;
    protected boolean cosignCoordinates;
    @XmlElement(required = true, nillable = true)
    protected String timestampCode;
    protected int pdfSignatureLayout;
    @XmlElement(required = true)
    protected String password;
    protected int pdfSignatureCertificationLevel;
    protected boolean cadesDetached;

    /**
     * Gets the value of the counterSignaturePath property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCounterSignaturePath() {
        return counterSignaturePath;
    }

    /**
     * Sets the value of the counterSignaturePath property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCounterSignaturePath(String value) {
        this.counterSignaturePath = value;
    }

    /**
     * Gets the value of the graphicalSignature property.
     * 
     */
    public boolean isGraphicalSignature() {
        return graphicalSignature;
    }

    /**
     * Sets the value of the graphicalSignature property.
     * 
     */
    public void setGraphicalSignature(boolean value) {
        this.graphicalSignature = value;
    }

    /**
     * Gets the value of the ocsp property.
     * 
     */
    public boolean isOcsp() {
        return ocsp;
    }

    /**
     * Sets the value of the ocsp property.
     * 
     */
    public void setOcsp(boolean value) {
        this.ocsp = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public boolean isTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(boolean value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the cosignCoordinates property.
     * 
     */
    public boolean isCosignCoordinates() {
        return cosignCoordinates;
    }

    /**
     * Sets the value of the cosignCoordinates property.
     * 
     */
    public void setCosignCoordinates(boolean value) {
        this.cosignCoordinates = value;
    }

    /**
     * Gets the value of the timestampCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTimestampCode() {
        return timestampCode;
    }

    /**
     * Sets the value of the timestampCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTimestampCode(String value) {
        this.timestampCode = value;
    }

    /**
     * Gets the value of the pdfSignatureLayout property.
     * 
     */
    public int getPdfSignatureLayout() {
        return pdfSignatureLayout;
    }

    /**
     * Sets the value of the pdfSignatureLayout property.
     * 
     */
    public void setPdfSignatureLayout(int value) {
        this.pdfSignatureLayout = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the pdfSignatureCertificationLevel property.
     * 
     */
    public int getPdfSignatureCertificationLevel() {
        return pdfSignatureCertificationLevel;
    }

    /**
     * Sets the value of the pdfSignatureCertificationLevel property.
     * 
     */
    public void setPdfSignatureCertificationLevel(int value) {
        this.pdfSignatureCertificationLevel = value;
    }

    /**
     * Gets the value of the cadesDetached property.
     * 
     */
    public boolean isCadesDetached() {
        return cadesDetached;
    }

    /**
     * Sets the value of the cadesDetached property.
     * 
     */
    public void setCadesDetached(boolean value) {
        this.cadesDetached = value;
    }
}