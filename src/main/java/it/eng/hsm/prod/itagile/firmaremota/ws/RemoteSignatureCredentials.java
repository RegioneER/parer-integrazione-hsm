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
 * Java class for RemoteSignatureCredentials complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RemoteSignatureCredentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientCertificateAuth" type="{http://ws.firmaremota.itagile.it}ClientCertificateAuth"/>
 *         &lt;element name="extAuth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oneshot" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteSignatureCredentials", propOrder = { "clientCertificateAuth", "extAuth", "password", "userid",
        "oneshot" })
public class RemoteSignatureCredentials {

    @XmlElement(required = true, nillable = true)
    protected ClientCertificateAuth clientCertificateAuth;
    @XmlElement(required = true, nillable = true)
    protected String extAuth;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String userid;
    protected boolean oneshot;

    /**
     * Gets the value of the clientCertificateAuth property.
     *
     * @return possible object is {@link ClientCertificateAuth }
     *
     */
    public ClientCertificateAuth getClientCertificateAuth() {
        return clientCertificateAuth;
    }

    /**
     * Sets the value of the clientCertificateAuth property.
     *
     * @param value
     *            allowed object is {@link ClientCertificateAuth }
     *
     */
    public void setClientCertificateAuth(ClientCertificateAuth value) {
        this.clientCertificateAuth = value;
    }

    /**
     * Gets the value of the extAuth property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExtAuth() {
        return extAuth;
    }

    /**
     * Sets the value of the extAuth property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setExtAuth(String value) {
        this.extAuth = value;
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
     * Gets the value of the userid property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the oneshot property.
     *
     */
    public boolean isOneshot() {
        return oneshot;
    }

    /**
     * Sets the value of the oneshot property.
     *
     */
    public void setOneshot(boolean value) {
        this.oneshot = value;
    }
}
