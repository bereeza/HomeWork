package org.example.lesson9.exception;

public class IncorrectBoxException extends RuntimeException {
    public IncorrectBoxException() {
    }

    public IncorrectBoxException(String message) {
        super(message);
    }

    public IncorrectBoxException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectBoxException(Throwable cause) {
        super(cause);
    }

    public IncorrectBoxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
