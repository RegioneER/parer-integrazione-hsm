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
