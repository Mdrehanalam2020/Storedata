package com.charter.ews.store.data.exception;


public class CharterWebFaultException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "An unsupported error has occurred.";

    public CharterWebFaultException() {
        super(DEFAULT_MESSAGE);
    }

    public CharterWebFaultException(String message) {
        super(message);
    }

    public CharterWebFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public CharterWebFaultException(Throwable cause) {
        super(DEFAULT_MESSAGE, cause);
    }

    protected CharterWebFaultException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
