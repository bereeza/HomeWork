package org.example.lesson20.factory.exception;

public class WrongProductTypeException extends RuntimeException {
    public WrongProductTypeException() {
    }

    public WrongProductTypeException(String message) {
        super(message);
    }

    public WrongProductTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongProductTypeException(Throwable cause) {
        super(cause);
    }

    public WrongProductTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
