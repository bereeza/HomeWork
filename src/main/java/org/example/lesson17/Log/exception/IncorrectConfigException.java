package org.example.lesson17.Log.exception;

public class IncorrectConfigException extends RuntimeException {
    public IncorrectConfigException() {
    }

    public IncorrectConfigException(String message) {
        super(message);
    }

    public IncorrectConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectConfigException(Throwable cause) {
        super(cause);
    }

    public IncorrectConfigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
