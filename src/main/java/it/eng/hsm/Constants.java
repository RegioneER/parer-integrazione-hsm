package it.eng.hsm;

/**
 * @author Moretti_Lu
 * 
 *         Contiene le costanti del HSM.
 *
 */
class Constants {

    static final String DIGEST_TYPE = "SHA256";

    enum HSM_MODULE {
        VERIFY, SIGN, XADES
    }
}