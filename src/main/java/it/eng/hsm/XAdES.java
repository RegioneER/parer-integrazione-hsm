package it.eng.hsm;

/**
 *
 * @author Moretti_Lu
 *
 */
public interface XAdES {

    enum PROFILES {
        BES, EPES
    }

    enum TYPE {
        ENVELOPED, ENVELOPING, DETACHED
    }

    enum VALIDATION {
        T, C, X, XL, A
    }
}