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
 *         &lt;element name="verifySignatures" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extractContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extractOriginal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extractX509" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signedDocument", "verifySignatures", "extractContent", "extractOriginal",
        "extractX509" })
@XmlRootElement(name = "documentP7mInfo")
public class DocumentP7MInfo {

    @XmlElement(required = true)
    protected byte[] signedDocument;
    protected boolean verifySignatures;
    protected boolean extractContent;
    protected boolean extractOriginal;
    protected boolean extractX509;

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
     * Gets the value of the verifySignatures property.
     * 
     */
    public boolean isVerifySignatures() {
        return verifySignatures;
    }

    /**
     * Sets the value of the verifySignatures property.
     * 
     */
    public void setVerifySignatures(boolean value) {
        this.verifySignatures = value;
    }

    /**
     * Gets the value of the extractContent property.
     * 
     */
    public boolean isExtractContent() {
        return extractContent;
    }

    /**
     * Sets the value of the extractContent property.
     * 
     */
    public void setExtractContent(boolean value) {
        this.extractContent = value;
    }

    /**
     * Gets the value of the extractOriginal property.
     * 
     */
    public boolean isExtractOriginal() {
        return extractOriginal;
    }

    /**
     * Sets the value of the extractOriginal property.
     * 
     */
    public void setExtractOriginal(boolean value) {
        this.extractOriginal = value;
    }

    /**
     * Gets the value of the extractX509 property.
     * 
     */
    public boolean isExtractX509() {
        return extractX509;
    }

    /**
     * Sets the value of the extractX509 property.
     * 
     */
    public void setExtractX509(boolean value) {
        this.extractX509 = value;
    }
}
