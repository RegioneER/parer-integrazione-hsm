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
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pinToSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dirSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dirDest" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="graphic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "", propOrder = { "userid", "password", "pinToSign", "domain", "dirSource", "dirDest", "fieldName",
        "page", "x", "y", "width", "height", "userName", "reason", "location", "dateFormat", "graphic", "text",
        "fontSize" })
@XmlRootElement(name = "signPDFPath")
public class SignPDFPath {

    @XmlElement(required = true)
    protected String userid;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String pinToSign;
    @XmlElement(required = true)
    protected String domain;
    @XmlElement(required = true)
    protected String dirSource;
    @XmlElement(required = true)
    protected String dirDest;
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
    protected boolean graphic;
    @XmlElement(required = true)
    protected String text;
    protected int fontSize;

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
     * Gets the value of the pinToSign property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPinToSign() {
        return pinToSign;
    }

    /**
     * Sets the value of the pinToSign property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPinToSign(String value) {
        this.pinToSign = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the dirSource property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDirSource() {
        return dirSource;
    }

    /**
     * Sets the value of the dirSource property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDirSource(String value) {
        this.dirSource = value;
    }

    /**
     * Gets the value of the dirDest property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDirDest() {
        return dirDest;
    }

    /**
     * Sets the value of the dirDest property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDirDest(String value) {
        this.dirDest = value;
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
     * Gets the value of the graphic property.
     * 
     */
    public boolean isGraphic() {
        return graphic;
    }

    /**
     * Sets the value of the graphic property.
     * 
     */
    public void setGraphic(boolean value) {
        this.graphic = value;
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
