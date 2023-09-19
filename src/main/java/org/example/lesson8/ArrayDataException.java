package org.example.lesson8;

public class ArrayDataException extends RuntimeException {
    public ArrayDataException(String message) {
        super(message);
    }

    public ArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayDataException(Throwable cause) {
        super(cause);
    }

    public ArrayDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ArrayDataException() {
    }
}
