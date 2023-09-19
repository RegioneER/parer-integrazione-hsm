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

import java.util.Date;

/**
 * Contains the CADES signature informations.
 *
 * @author Moretti_Lu
 */
public class SignatureCades extends Signature {

    /**
     * Constructor for a CADES signature
     *
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     *            data di firma
     */
    public SignatureCades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate) {
        super(certificate, digestAlg, signDate);
    }

    /**
     * Constructor for a CADES signature.
     *
     * @param certificate
     *            mandatory
     * @param digestAlg
     *            mandatory
     * @param signDate
     *            data di firma
     * @param file
     *            documento di riferimento
     */
    public SignatureCades(Certificate certificate, DIGEST_ALGORITH digestAlg, Date signDate, byte[] file) {
        super(certificate, digestAlg, signDate, file);
    }

    @Override
    public TYPE getType() {
        return TYPE.CADES;
    }
}
