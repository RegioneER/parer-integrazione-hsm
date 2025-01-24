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
 *         &lt;element name="cred" type="{http://ws.firmaremota.itagile.it}RemoteSignatureCredentials"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="contentInAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="digestType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X509certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="flags" type="{http://ws.firmaremota.itagile.it}SignatureFlags"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fontSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cred", "content", "contentInAttachments", "digestType", "x509Certificate", "flags",
        "fieldName", "page", "x", "y", "width", "height", "userName", "reason", "location", "dateFormat", "text",
        "fontSize" })
@XmlRootElement(name = "signPDF")
public class SignPDF {

    @XmlElement(required = true)
    protected RemoteSignatureCredentials cred;
    @XmlElement(required = true)
    protected byte[] content;
    protected boolean contentInAttachments;
    @XmlElement(required = true)
    protected String digestType;
    @XmlElement(name = "X509certificate", required = true)
    protected byte[] x509Certificate;
    @XmlElement(required = true)
    protected SignatureFlags flags;
    @XmlElement(required = true)
    protected String fieldName;
    protected int page;
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String dateFormat;
    @XmlElement(required = true)
    protected String text;
    protected int fontSize;

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
     * @return possible object is byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     *
     * @param value
     *            allowed object is byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
    }

    /**
     * Gets the value of the contentInAttachments property.
     *
     */
    public boolean isContentInAttachments() {
        return contentInAttachments;
    }

    /**
     * Sets the value of the contentInAttachments property.
     *
     */
    public void setContentInAttachments(boolean value) {
        this.contentInAttachments = value;
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

    /**
     * Gets the value of the flags property.
     *
     * @return possible object is {@link SignatureFlags }
     *
     */
    public SignatureFlags getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     *
     * @param value
     *            allowed object is {@link SignatureFlags }
     *
     */
    public void setFlags(SignatureFlags value) {
        this.flags = value;
    }

    /**
     * Gets the value of the fieldName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the page property.
     *
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     *
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Gets the value of the x property.
     *
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     *
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     *
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     *
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * Gets the value of the width property.
     *
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     *
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the userName property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the reason property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the dateFormat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the text property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the fontSize property.
     *
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     *
     */
    public void setFontSize(int value) {
        this.fontSize = value;
    }
}
