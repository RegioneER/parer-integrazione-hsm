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
 *         &lt;element name="documentXadesInfoReturn" type="{http://ws.firmaremota.itagile.it}SignatureDocumentInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "documentXadesInfoReturn" })
@XmlRootElement(name = "documentXadesInfoResponse")
public class DocumentXadesInfoResponse {

    @XmlElement(required = true)
    protected SignatureDocumentInfo documentXadesInfoReturn;

    /**
     * Gets the value of the documentXadesInfoReturn property.
     *
     * @return possible object is {@link SignatureDocumentInfo }
     *
     */
    public SignatureDocumentInfo getDocumentXadesInfoReturn() {
        return documentXadesInfoReturn;
    }

    /**
     * Sets the value of the documentXadesInfoReturn property.
     *
     * @param value
     *            allowed object is {@link SignatureDocumentInfo }
     *
     */
    public void setDocumentXadesInfoReturn(SignatureDocumentInfo value) {
        this.documentXadesInfoReturn = value;
    }
}
