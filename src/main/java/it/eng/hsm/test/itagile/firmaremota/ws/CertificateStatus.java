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

package it.eng.hsm.test.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CertificateStatus complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="checkTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="invalidCertificateMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invalidCertificateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trustedIdentity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="untrustedIdentityMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="untrustedIdentityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateStatus", propOrder = { "certificate", "checkTime", "invalidCertificateMessage",
        "invalidCertificateCode", "trustedIdentity", "untrustedIdentityMessage", "untrustedIdentityCode",
        "validCertificate" })
public class CertificateStatus {

    @XmlElement(required = true, nillable = true)
    protected byte[] certificate;
    protected long checkTime;
    @XmlElement(required = true, nillable = true)
    protected String invalidCertificateMessage;
    @XmlElement(required = true, nillable = true)
    protected String invalidCertificateCode;
    protected boolean trustedIdentity;
    @XmlElement(required = true, nillable = true)
    protected String untrustedIdentityMessage;
    @XmlElement(required = true, nillable = true)
    protected String untrustedIdentityCode;
    protected boolean validCertificate;

    /**
     * Gets the value of the certificate property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setCertificate(byte[] value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the checkTime property.
     * 
     */
    public long getCheckTime() {
        return checkTime;
    }

    /**
     * Sets the value of the checkTime property.
     * 
     */
    public void setCheckTime(long value) {
        this.checkTime = value;
    }

    /**
     * Gets the value of the invalidCertificateMessage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInvalidCertificateMessage() {
        return invalidCertificateMessage;
    }

    /**
     * Sets the value of the invalidCertificateMessage property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setInvalidCertificateMessage(String value) {
        this.invalidCertificateMessage = value;
    }

    /**
     * Gets the value of the invalidCertificateCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInvalidCertificateCode() {
        return invalidCertificateCode;
    }

    /**
     * Sets the value of the invalidCertificateCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setInvalidCertificateCode(String value) {
        this.invalidCertificateCode = value;
    }

    /**
     * Gets the value of the trustedIdentity property.
     * 
     */
    public boolean isTrustedIdentity() {
        return trustedIdentity;
    }

    /**
     * Sets the value of the trustedIdentity property.
     * 
     */
    public void setTrustedIdentity(boolean value) {
        this.trustedIdentity = value;
    }

    /**
     * Gets the value of the untrustedIdentityMessage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUntrustedIdentityMessage() {
        return untrustedIdentityMessage;
    }

    /**
     * Sets the value of the untrustedIdentityMessage property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUntrustedIdentityMessage(String value) {
        this.untrustedIdentityMessage = value;
    }

    /**
     * Gets the value of the untrustedIdentityCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUntrustedIdentityCode() {
        return untrustedIdentityCode;
    }

    /**
     * Sets the value of the untrustedIdentityCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUntrustedIdentityCode(String value) {
        this.untrustedIdentityCode = value;
    }

    /**
     * Gets the value of the validCertificate property.
     * 
     */
    public boolean isValidCertificate() {
        return validCertificate;
    }

    /**
     * Sets the value of the validCertificate property.
     * 
     */
    public void setValidCertificate(boolean value) {
        this.validCertificate = value;
    }
}
