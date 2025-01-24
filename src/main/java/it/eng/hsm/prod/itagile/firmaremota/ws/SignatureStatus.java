/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.hsm.prod.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SignatureStatus complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SignatureStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certStatus" type="{http://ws.firmaremota.itagile.it}CertificateStatus"/>
 *         &lt;element name="counterSignatures" type="{http://ws.firmaremota.itagile.it}ArrayOfSignatureStatus"/>
 *         &lt;element name="digestAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encryptionAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invalidSignatureMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invalidTimestampMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timestampCertificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="validSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="invalidSignatureCode" type="{http://ws.firmaremota.itagile.it}ArrayOfString"/>
 *         &lt;element name="invalidTimestampCode" type="{http://ws.firmaremota.itagile.it}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureStatus", propOrder = { "certStatus", "counterSignatures", "digestAlgorithm",
        "encryptionAlgorithm", "invalidSignatureMessage", "invalidTimestampMessage", "locality", "reason", "fieldName",
        "signatureTime", "timestamp", "timestampCertificate", "validSignature", "validTimestamp",
        "invalidSignatureCode", "invalidTimestampCode" })
public class SignatureStatus {

    @XmlElement(required = true, nillable = true)
    protected CertificateStatus certStatus;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfSignatureStatus counterSignatures;
    @XmlElement(required = true, nillable = true)
    protected String digestAlgorithm;
    @XmlElement(required = true, nillable = true)
    protected String encryptionAlgorithm;
    @XmlElement(required = true, nillable = true)
    protected String invalidSignatureMessage;
    @XmlElement(required = true, nillable = true)
    protected String invalidTimestampMessage;
    @XmlElement(required = true, nillable = true)
    protected String locality;
    @XmlElement(required = true, nillable = true)
    protected String reason;
    @XmlElement(required = true, nillable = true)
    protected String fieldName;
    protected long signatureTime;
    protected boolean timestamp;
    @XmlElement(required = true, nillable = true)
    protected byte[] timestampCertificate;
    protected boolean validSignature;
    protected boolean validTimestamp;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString invalidSignatureCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString invalidTimestampCode;

    /**
     * Gets the value of the certStatus property.
     *
     * @return possible object is {@link CertificateStatus }
     *
     */
    public CertificateStatus getCertStatus() {
        return certStatus;
    }

    /**
     * Sets the value of the certStatus property.
     *
     * @param value
     *            allowed object is {@link CertificateStatus }
     *
     */
    public void setCertStatus(CertificateStatus value) {
        this.certStatus = value;
    }

    /**
     * Gets the value of the counterSignatures property.
     *
     * @return possible object is {@link ArrayOfSignatureStatus }
     *
     */
    public ArrayOfSignatureStatus getCounterSignatures() {
        return counterSignatures;
    }

    /**
     * Sets the value of the counterSignatures property.
     *
     * @param value
     *            allowed object is {@link ArrayOfSignatureStatus }
     *
     */
    public void setCounterSignatures(ArrayOfSignatureStatus value) {
        this.counterSignatures = value;
    }

    /**
     * Gets the value of the digestAlgorithm property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    /**
     * Sets the value of the digestAlgorithm property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setDigestAlgorithm(String value) {
        this.digestAlgorithm = value;
    }

    /**
     * Gets the value of the encryptionAlgorithm property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * Sets the value of the encryptionAlgorithm property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setEncryptionAlgorithm(String value) {
        this.encryptionAlgorithm = value;
    }

    /**
     * Gets the value of the invalidSignatureMessage property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getInvalidSignatureMessage() {
        return invalidSignatureMessage;
    }

    /**
     * Sets the value of the invalidSignatureMessage property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setInvalidSignatureMessage(String value) {
        this.invalidSignatureMessage = value;
    }

    /**
     * Gets the value of the invalidTimestampMessage property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getInvalidTimestampMessage() {
        return invalidTimestampMessage;
    }

    /**
     * Sets the value of the invalidTimestampMessage property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setInvalidTimestampMessage(String value) {
        this.invalidTimestampMessage = value;
    }

    /**
     * Gets the value of the locality property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setLocality(String value) {
        this.locality = value;
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

    /**
     * Gets the value of the fieldName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the signatureTime property.
     *
     */
    public long getSignatureTime() {
        return signatureTime;
    }

    /**
     * Sets the value of the signatureTime property.
     *
     */
    public void setSignatureTime(long value) {
        this.signatureTime = value;
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
     * Gets the value of the timestampCertificate property.
     *
     * @return possible object is byte[]
     */
    public byte[] getTimestampCertificate() {
        return timestampCertificate;
    }

    /**
     * Sets the value of the timestampCertificate property.
     *
     * @param value
     *            allowed object is byte[]
     */
    public void setTimestampCertificate(byte[] value) {
        this.timestampCertificate = value;
    }

    /**
     * Gets the value of the validSignature property.
     *
     */
    public boolean isValidSignature() {
        return validSignature;
    }

    /**
     * Sets the value of the validSignature property.
     *
     */
    public void setValidSignature(boolean value) {
        this.validSignature = value;
    }

    /**
     * Gets the value of the validTimestamp property.
     *
     */
    public boolean isValidTimestamp() {
        return validTimestamp;
    }

    /**
     * Sets the value of the validTimestamp property.
     *
     */
    public void setValidTimestamp(boolean value) {
        this.validTimestamp = value;
    }

    /**
     * Gets the value of the invalidSignatureCode property.
     *
     * @return possible object is {@link ArrayOfString }
     *
     */
    public ArrayOfString getInvalidSignatureCode() {
        return invalidSignatureCode;
    }

    /**
     * Sets the value of the invalidSignatureCode property.
     *
     * @param value
     *            allowed object is {@link ArrayOfString }
     *
     */
    public void setInvalidSignatureCode(ArrayOfString value) {
        this.invalidSignatureCode = value;
    }

    /**
     * Gets the value of the invalidTimestampCode property.
     *
     * @return possible object is {@link ArrayOfString }
     *
     */
    public ArrayOfString getInvalidTimestampCode() {
        return invalidTimestampCode;
    }

    /**
     * Sets the value of the invalidTimestampCode property.
     *
     * @param value
     *            allowed object is {@link ArrayOfString }
     *
     */
    public void setInvalidTimestampCode(ArrayOfString value) {
        this.invalidTimestampCode = value;
    }
}
