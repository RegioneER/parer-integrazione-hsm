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
 * Java class for Signature complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Signature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="digestAlg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fiscalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certKeyUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trustSp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certDateFrom" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="certDateTo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tsAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tsLenght" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="signatureField" type="{http://ws.firmaremota.itagile.it}SignatureField"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validSign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validCert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validTrust" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="signErrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certErrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trustErrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p7mLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p7mPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="x509" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signature", propOrder = { "signType", "digestAlg", "signTime", "givenName", "surName", "fiscalCode",
        "organization", "orgUnit", "certID", "certType", "certSerial", "certKeyUsage", "trustSp", "certDateFrom",
        "certDateTo", "timestamp", "tsAuthority", "tsLenght", "signatureField", "valid", "validSign", "validCert",
        "validTrust", "validTimestamp", "signErrCode", "certErrCode", "trustErrCode", "p7MLevel", "p7MPath", "x509" })
public class Signature {

    @XmlElement(required = true, nillable = true)
    protected String signType;
    @XmlElement(required = true, nillable = true)
    protected String digestAlg;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long signTime;
    @XmlElement(required = true, nillable = true)
    protected String givenName;
    @XmlElement(required = true, nillable = true)
    protected String surName;
    @XmlElement(required = true, nillable = true)
    protected String fiscalCode;
    @XmlElement(required = true, nillable = true)
    protected String organization;
    @XmlElement(required = true, nillable = true)
    protected String orgUnit;
    @XmlElement(required = true, nillable = true)
    protected String certID;
    @XmlElement(required = true, nillable = true)
    protected String certType;
    @XmlElement(required = true, nillable = true)
    protected String certSerial;
    @XmlElement(required = true, nillable = true)
    protected String certKeyUsage;
    @XmlElement(required = true, nillable = true)
    protected String trustSp;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long certDateFrom;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long certDateTo;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean timestamp;
    @XmlElement(required = true, nillable = true)
    protected String tsAuthority;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long tsLenght;
    @XmlElement(required = true, nillable = true)
    protected SignatureField signatureField;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean valid;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean validSign;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean validCert;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean validTrust;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean validTimestamp;
    @XmlElement(required = true, nillable = true)
    protected String signErrCode;
    @XmlElement(required = true, nillable = true)
    protected String certErrCode;
    @XmlElement(required = true, nillable = true)
    protected String trustErrCode;
    @XmlElement(name = "p7mLevel", required = true, type = Integer.class, nillable = true)
    protected Integer p7MLevel;
    @XmlElement(name = "p7mPath", required = true, nillable = true)
    protected String p7MPath;
    @XmlElement(required = true, nillable = true)
    protected byte[] x509;

    /**
     * Gets the value of the signType property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSignType() {
        return signType;
    }

    /**
     * Sets the value of the signType property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setSignType(String value) {
        this.signType = value;
    }

    /**
     * Gets the value of the digestAlg property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDigestAlg() {
        return digestAlg;
    }

    /**
     * Sets the value of the digestAlg property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setDigestAlg(String value) {
        this.digestAlg = value;
    }

    /**
     * Gets the value of the signTime property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getSignTime() {
        return signTime;
    }

    /**
     * Sets the value of the signTime property.
     *
     * @param value
     *            allowed object is {@link Long }
     *
     */
    public void setSignTime(Long value) {
        this.signTime = value;
    }

    /**
     * Gets the value of the givenName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the surName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setSurName(String value) {
        this.surName = value;
    }

    /**
     * Gets the value of the fiscalCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    /**
     * Sets the value of the fiscalCode property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setFiscalCode(String value) {
        this.fiscalCode = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the orgUnit property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOrgUnit() {
        return orgUnit;
    }

    /**
     * Sets the value of the orgUnit property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setOrgUnit(String value) {
        this.orgUnit = value;
    }

    /**
     * Gets the value of the certID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCertID() {
        return certID;
    }

    /**
     * Sets the value of the certID property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setCertID(String value) {
        this.certID = value;
    }

    /**
     * Gets the value of the certType property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCertType() {
        return certType;
    }

    /**
     * Sets the value of the certType property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setCertType(String value) {
        this.certType = value;
    }

    /**
     * Gets the value of the certSerial property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCertSerial() {
        return certSerial;
    }

    /**
     * Sets the value of the certSerial property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setCertSerial(String value) {
        this.certSerial = value;
    }

    /**
     * Gets the value of the certKeyUsage property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCertKeyUsage() {
        return certKeyUsage;
    }

    /**
     * Sets the value of the certKeyUsage property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setCertKeyUsage(String value) {
        this.certKeyUsage = value;
    }

    /**
     * Gets the value of the trustSp property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTrustSp() {
        return trustSp;
    }

    /**
     * Sets the value of the trustSp property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setTrustSp(String value) {
        this.trustSp = value;
    }

    /**
     * Gets the value of the certDateFrom property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getCertDateFrom() {
        return certDateFrom;
    }

    /**
     * Sets the value of the certDateFrom property.
     *
     * @param value
     *            allowed object is {@link Long }
     *
     */
    public void setCertDateFrom(Long value) {
        this.certDateFrom = value;
    }

    /**
     * Gets the value of the certDateTo property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getCertDateTo() {
        return certDateTo;
    }

    /**
     * Sets the value of the certDateTo property.
     *
     * @param value
     *            allowed object is {@link Long }
     *
     */
    public void setCertDateTo(Long value) {
        this.certDateTo = value;
    }

    /**
     * Gets the value of the timestamp property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setTimestamp(Boolean value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the tsAuthority property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTsAuthority() {
        return tsAuthority;
    }

    /**
     * Sets the value of the tsAuthority property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setTsAuthority(String value) {
        this.tsAuthority = value;
    }

    /**
     * Gets the value of the tsLenght property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getTsLenght() {
        return tsLenght;
    }

    /**
     * Sets the value of the tsLenght property.
     *
     * @param value
     *            allowed object is {@link Long }
     *
     */
    public void setTsLenght(Long value) {
        this.tsLenght = value;
    }

    /**
     * Gets the value of the signatureField property.
     *
     * @return possible object is {@link SignatureField }
     *
     */
    public SignatureField getSignatureField() {
        return signatureField;
    }

    /**
     * Sets the value of the signatureField property.
     *
     * @param value
     *            allowed object is {@link SignatureField }
     *
     */
    public void setSignatureField(SignatureField value) {
        this.signatureField = value;
    }

    /**
     * Gets the value of the valid property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

    /**
     * Gets the value of the validSign property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isValidSign() {
        return validSign;
    }

    /**
     * Sets the value of the validSign property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setValidSign(Boolean value) {
        this.validSign = value;
    }

    /**
     * Gets the value of the validCert property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isValidCert() {
        return validCert;
    }

    /**
     * Sets the value of the validCert property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setValidCert(Boolean value) {
        this.validCert = value;
    }

    /**
     * Gets the value of the validTrust property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isValidTrust() {
        return validTrust;
    }

    /**
     * Sets the value of the validTrust property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setValidTrust(Boolean value) {
        this.validTrust = value;
    }

    /**
     * Gets the value of the validTimestamp property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isValidTimestamp() {
        return validTimestamp;
    }

    /**
     * Sets the value of the validTimestamp property.
     *
     * @param value
     *            allowed object is {@link Boolean }
     *
     */
    public void setValidTimestamp(Boolean value) {
        this.validTimestamp = value;
    }

    /**
     * Gets the value of the signErrCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSignErrCode() {
        return signErrCode;
    }

    /**
     * Sets the value of the signErrCode property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setSignErrCode(String value) {
        this.signErrCode = value;
    }

    /**
     * Gets the value of the certErrCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCertErrCode() {
        return certErrCode;
    }

    /**
     * Sets the value of the certErrCode property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setCertErrCode(String value) {
        this.certErrCode = value;
    }

    /**
     * Gets the value of the trustErrCode property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTrustErrCode() {
        return trustErrCode;
    }

    /**
     * Sets the value of the trustErrCode property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setTrustErrCode(String value) {
        this.trustErrCode = value;
    }

    /**
     * Gets the value of the p7MLevel property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getP7MLevel() {
        return p7MLevel;
    }

    /**
     * Sets the value of the p7MLevel property.
     *
     * @param value
     *            allowed object is {@link Integer }
     *
     */
    public void setP7MLevel(Integer value) {
        this.p7MLevel = value;
    }

    /**
     * Gets the value of the p7MPath property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getP7MPath() {
        return p7MPath;
    }

    /**
     * Sets the value of the p7MPath property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setP7MPath(String value) {
        this.p7MPath = value;
    }

    /**
     * Gets the value of the x509 property.
     *
     * @return possible object is byte[]
     */
    public byte[] getX509() {
        return x509;
    }

    /**
     * Sets the value of the x509 property.
     *
     * @param value
     *            allowed object is byte[]
     */
    public void setX509(byte[] value) {
        this.x509 = value;
    }
}
