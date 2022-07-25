package it.eng.hsm;

/**
 * This {@link HSMException} subclass is launched when the user is blocked.
 *
 * @author Moretti_Lu
 *
 */
public class UserBlockedException extends HSMException {

    public UserBlockedException() {
        super(ErrorUtils.USR_BLOCKED_EXCEPTION_COD);
    }
}