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
 *         &lt;element name="documentP7mInfoReturn" type="{http://ws.firmaremota.itagile.it}SignatureDocumentInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "documentP7MInfoReturn" })
@XmlRootElement(name = "documentP7mInfoResponse")
public class DocumentP7MInfoResponse {

    @XmlElement(name = "documentP7mInfoReturn", required = true)
    protected SignatureDocumentInfo documentP7MInfoReturn;

    /**
     * Gets the value of the documentP7MInfoReturn property.
     *
     * @return possible object is {@link SignatureDocumentInfo }
     *
     */
    public SignatureDocumentInfo getDocumentP7MInfoReturn() {
        return documentP7MInfoReturn;
    }

    /**
     * Sets the value of the documentP7MInfoReturn property.
     *
     * @param value
     *            allowed object is {@link SignatureDocumentInfo }
     *
     */
    public void setDocumentP7MInfoReturn(SignatureDocumentInfo value) {
        this.documentP7MInfoReturn = value;
    }
}
