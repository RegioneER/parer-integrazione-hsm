package it.eng.hsm.beans;

import it.eng.hsm.XAdES;

/**
 * This bean contains the informations about how create the XAdES signature
 *
 * @author moretti_lu
 */
public class ConfigurationXAdES {

    private XAdES.PROFILES profile;
    private XAdES.TYPE type;
    private XAdES.VALIDATION validation;

    /**
     * This constructor sets the values to their default value.
     * 
     */
    public ConfigurationXAdES() {
        this.profile = XAdES.PROFILES.BES;
        this.type = XAdES.TYPE.ENVELOPED;
        this.validation = null;
    }

    public ConfigurationXAdES(XAdES.PROFILES profile, XAdES.TYPE type, XAdES.VALIDATION validation) {
        this.profile = profile;
        this.type = type;
        this.validation = validation;
    }

    /**
     * @return the profile
     */
    public XAdES.PROFILES getProfile() {
        return profile;
    }

    /**
     * @return the type
     */
    public XAdES.TYPE getType() {
        return type;
    }

    /**
     * @return the validation
     */
    public XAdES.VALIDATION getValidation() {
        return validation;
    }
}