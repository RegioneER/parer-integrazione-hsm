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

package it.eng.hsm;

/**
 * Factory creates the HSM client for the environments.
 *
 * @author Moretti_Lu
 *
 */
public class HSM {

    public enum AMBIENTE_HSM {
        TEST, PRODUZIONE
    }

    public static ClientHSM getInstance(AMBIENTE_HSM ambiente) throws HSMException {
        ClientHSM instance = null;

        switch (ambiente) {
        case TEST:
            instance = new ClientHSM_Test();
            break;

        case PRODUZIONE:
            instance = new ClientHSM_Prod();
            break;
        }

        return instance;
    }
}
