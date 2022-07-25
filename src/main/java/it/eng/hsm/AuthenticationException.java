package it.eng.hsm;

/**
 * This {@link HSMException} subclass is launched when the user credentials are wrong.
 *
 * @author Moretti_Lu
 *
 */
public class AuthenticationException extends HSMException {

    public AuthenticationException() {
        super(ErrorUtils.AUTH_EXCEPTION_COD);
    }
}