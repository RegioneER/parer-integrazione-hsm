package it.eng.hsm.beans;

/**
 * This bean contains the informations about a sign session
 *
 * @author Moretti_Lu
 *
 */
public class HSMSignatureSession {

    private HSMUser user;
    /**
     * Used to close the signature session
     */
    private String sessionToken;

    public HSMSignatureSession(HSMUser user, String sessionToken) {
        if (user == null || sessionToken == null) {
            throw new IllegalArgumentException();
        }

        this.user = user;
        this.sessionToken = sessionToken;
    }

    public HSMUser getUser() {
        return user;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Clean the information about user; this method has to be used when you finished to use credentials.
     * 
     */
    public void cleanSession() {
        user.cleanUser();
    }
}