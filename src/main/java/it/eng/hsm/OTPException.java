package it.eng.hsm;

/**
 * This {@link HSMException} subclass is launched when the OTP (One Time Password) is wrong.
 *
 * @author Moretti_Lu
 *
 */
public class OTPException extends HSMException {

    public OTPException() {
        super(ErrorUtils.OTP_EXCEPTION_COD);
    }
}