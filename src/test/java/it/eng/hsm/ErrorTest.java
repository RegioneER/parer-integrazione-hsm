package it.eng.hsm;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit module that tests the {@link ErrorUtils} functions.
 *
 * @author Moretti_Lu
 *
 */
public class ErrorTest {

    private static final String COD_PROVA = "009";

    @Test
    public void testWorks() {
        Assert.assertNotNull(ErrorUtils.getErrorDescription("010"));
        testConstants();
        testErrorDescription();
    }

    @Test(expected = AuthenticationException.class)
    public void testAuthException() throws HSMException {
        ErrorUtils.throwsHSMException(ErrorUtils.AUTH_EXCEPTION_COD);
    }

    @Test(expected = OTPException.class)
    public void testOTPException() throws HSMException {
        ErrorUtils.throwsHSMException(ErrorUtils.OTP_EXCEPTION_COD);
    }

    @Test(expected = UserBlockedException.class)
    public void testUsrBlockedException() throws HSMException {
        ErrorUtils.throwsHSMException(ErrorUtils.USR_BLOCKED_EXCEPTION_COD);
    }

    @Test(expected = HSMException.class)
    public void testHSMException() throws HSMException {
        ErrorUtils.throwsHSMException(COD_PROVA);
    }

    private void testConstants() {
        String authMsg = ErrorUtils.getErrorDescription(ErrorUtils.AUTH_EXCEPTION_COD);
        String otpMsg = ErrorUtils.getErrorDescription(ErrorUtils.OTP_EXCEPTION_COD);

        Assert.assertEquals("Authentication failed", authMsg);
        Assert.assertEquals("Strong authentication failed", otpMsg);
    }

    private void testErrorDescription() {
        Assert.assertEquals(ErrorUtils.UNKNOWN_ERROR, ErrorUtils.getErrorDescription(null));
        Assert.assertEquals(ErrorUtils.UNKNOWN_ERROR, ErrorUtils.getErrorDescription(""));
        Assert.assertEquals(ErrorUtils.UNKNOWN_ERROR, ErrorUtils.getErrorDescription("pluto"));
    }
}