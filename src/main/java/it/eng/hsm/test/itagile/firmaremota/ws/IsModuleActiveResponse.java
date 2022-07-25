package it.eng.hsm.test.itagile.firmaremota.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="isModuleActiveReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "isModuleActiveReturn" })
@XmlRootElement(name = "isModuleActiveResponse")
public class IsModuleActiveResponse {

    protected boolean isModuleActiveReturn;

    /**
     * Gets the value of the isModuleActiveReturn property.
     * 
     */
    public boolean isIsModuleActiveReturn() {
        return isModuleActiveReturn;
    }

    /**
     * Sets the value of the isModuleActiveReturn property.
     * 
     */
    public void setIsModuleActiveReturn(boolean value) {
        this.isModuleActiveReturn = value;
    }
}