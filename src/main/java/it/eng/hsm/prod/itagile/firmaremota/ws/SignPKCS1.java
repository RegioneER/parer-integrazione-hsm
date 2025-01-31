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
 *         &lt;element name="cred" type="{http://ws.firmaremota.itagile.it}RemoteSignatureCredentials"/>
 *         &lt;element name="digest" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="digestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X509certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cred", "digest", "digestType", "x509Certificate" })
@XmlRootElement(name = "signPKCS1")
public class SignPKCS1 {

    @XmlElement(required = true)
    protected RemoteSignatureCredentials cred;
    @XmlElement(required = true)
    protected byte[] digest;
    @XmlElement(required = true)
    protected String digestType;
    @XmlElement(name = "X509certificate", required = true)
    protected byte[] x509Certificate;

    /**
     * Gets the value of the cred property.
     *
     * @return possible object is {@link RemoteSignatureCredentials }
     *
     */
    public RemoteSignatureCredentials getCred() {
        return cred;
    }

    /**
     * Sets the value of the cred property.
     *
     * @param value
     *            allowed object is {@link RemoteSignatureCredentials }
     *
     */
    public void setCred(RemoteSignatureCredentials value) {
        this.cred = value;
    }

    /**
     * Gets the value of the digest property.
     *
     * @return possible object is byte[]
     */
    public byte[] getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     *
     * @param value
     *            allowed object is byte[]
     */
    public void setDigest(byte[] value) {
        this.digest = value;
    }

    /**
     * Gets the value of the digestType property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDigestType() {
        return digestType;
    }

    /**
     * Sets the value of the digestType property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setDigestType(String value) {
        this.digestType = value;
    }

    /**
     * Gets the value of the x509Certificate property.
     *
     * @return possible object is byte[]
     */
    public byte[] getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Sets the value of the x509Certificate property.
     *
     * @param value
     *            allowed object is byte[]
     */
    public void setX509Certificate(byte[] value) {
        this.x509Certificate = value;
    }
}
