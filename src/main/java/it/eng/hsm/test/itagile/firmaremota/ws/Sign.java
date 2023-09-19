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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sign complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cred" type="{http://ws.firmaremota.itagile.it}RemoteSignatureCredentials" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="digestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="params" type="{http://ws.firmaremota.itagile.it}RemoteSignatureXadesParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sign", propOrder = { "cred", "content", "digestType", "certificate", "params" })
public class Sign {

    protected RemoteSignatureCredentials cred;
    @XmlElementRef(name = "content", namespace = "http://ws.firmaremota.itagile.it", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> content;
    protected String digestType;
    @XmlElementRef(name = "certificate", namespace = "http://ws.firmaremota.itagile.it", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> certificate;
    protected RemoteSignatureXadesParams params;

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
     * Gets the value of the content property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    public JAXBElement<byte[]> getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    public void setContent(JAXBElement<byte[]> value) {
        this.content = value;
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
     * Gets the value of the certificate property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    public JAXBElement<byte[]> getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *            allowed object is {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    public void setCertificate(JAXBElement<byte[]> value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return possible object is {@link RemoteSignatureXadesParams }
     * 
     */
    public RemoteSignatureXadesParams getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *            allowed object is {@link RemoteSignatureXadesParams }
     * 
     */
    public void setParams(RemoteSignatureXadesParams value) {
        this.params = value;
    }
}
