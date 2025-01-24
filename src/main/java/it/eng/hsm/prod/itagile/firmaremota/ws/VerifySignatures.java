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
 *         &lt;element name="signedDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="docsInAttachment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signedDocument", "docsInAttachment", "mimeType" })
@XmlRootElement(name = "verifySignatures")
public class VerifySignatures {

    @XmlElement(required = true)
    protected byte[] signedDocument;
    protected boolean docsInAttachment;
    @XmlElement(required = true)
    protected String mimeType;

    /**
     * Gets the value of the signedDocument property.
     *
     * @return possible object is byte[]
     */
    public byte[] getSignedDocument() {
        return signedDocument;
    }

    /**
     * Sets the value of the signedDocument property.
     *
     * @param value
     *            allowed object is byte[]
     */
    public void setSignedDocument(byte[] value) {
        this.signedDocument = value;
    }

    /**
     * Gets the value of the docsInAttachment property.
     *
     */
    public boolean isDocsInAttachment() {
        return docsInAttachment;
    }

    /**
     * Sets the value of the docsInAttachment property.
     *
     */
    public void setDocsInAttachment(boolean value) {
        this.docsInAttachment = value;
    }

    /**
     * Gets the value of the mimeType property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }
}
