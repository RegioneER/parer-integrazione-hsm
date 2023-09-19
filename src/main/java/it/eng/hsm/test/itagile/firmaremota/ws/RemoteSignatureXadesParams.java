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
 * Java class for RemoteSignatureXadesParams complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteSignatureXadesParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detachedReferenceURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elemenXPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="form" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validationData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteSignatureXadesParams", propOrder = { "detachedReferenceURI", "elemenXPath", "form",
        "signatureId", "type", "validationData" })
public class RemoteSignatureXadesParams {

    @XmlElement(required = true, nillable = true)
    protected String detachedReferenceURI;
    @XmlElement(required = true, nillable = true)
    protected String elemenXPath;
    @XmlElement(required = true, nillable = true)
    protected String form;
    @XmlElement(required = true, nillable = true)
    protected String signatureId;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String validationData;

    /**
     * Gets the value of the detachedReferenceURI property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDetachedReferenceURI() {
        return detachedReferenceURI;
    }

    /**
     * Sets the value of the detachedReferenceURI property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDetachedReferenceURI(String value) {
        this.detachedReferenceURI = value;
    }

    /**
     * Gets the value of the elemenXPath property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getElemenXPath() {
        return elemenXPath;
    }

    /**
     * Sets the value of the elemenXPath property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setElemenXPath(String value) {
        this.elemenXPath = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the signatureId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSignatureId() {
        return signatureId;
    }

    /**
     * Sets the value of the signatureId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSignatureId(String value) {
        this.signatureId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the validationData property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getValidationData() {
        return validationData;
    }

    /**
     * Sets the value of the validationData property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setValidationData(String value) {
        this.validationData = value;
    }
}
