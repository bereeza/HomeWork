package org.example.lesson16.task2;

public class FuelIsOutException extends RuntimeException{
    public FuelIsOutException() {
    }

    public FuelIsOutException(String message) {
        super(message);
    }

    public FuelIsOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public FuelIsOutException(Throwable cause) {
        super(cause);
    }

    public FuelIsOutException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
