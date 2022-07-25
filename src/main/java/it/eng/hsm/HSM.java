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