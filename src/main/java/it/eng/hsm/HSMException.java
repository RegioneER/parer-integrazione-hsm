package it.eng.hsm;

/**
 * This {@link Exception} subclass is launched when the HSM don't run correctly.
 *
 * @author Moretti_Lu
 *
 */
public class HSMException extends Exception {

    /**
     * HSM error code.
     */
    private String errorCode;

    /**
     * This constructor will be used when the HSM doesn't return the error code which caused the error.
     * 
     */
    public HSMException() {
        super();
    }

    /**
     * This constructor requires the error code and the exception thrown.
     * 
     * @param errorCode
     * @param cause
     */
    public HSMException(String errorCode, Throwable cause) {
        super(ErrorUtils.getErrorDescription(errorCode), cause);

        this.errorCode = errorCode;
    }

    /**
     * This constructor requires the error code.
     * 
     * @param errorCode
     */
    public HSMException(String errorCode) {
        this(errorCode, null);
    }

    /**
     * This constructor requires the exception thrown.
     * 
     * @param cause
     */
    public HSMException(Throwable cause) {
        super(cause);
    }

    /**
     * Returns the code of the thrown error.
     * 
     * @return the description of the thrown error
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Returns the description of the thrown error.
     * 
     * @return the description of the thrown error
     */
    public String getErrorDescription() {
        return ErrorUtils.getErrorDescription(errorCode);
    }
}