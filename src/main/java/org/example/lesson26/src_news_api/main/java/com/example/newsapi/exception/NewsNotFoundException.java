package com.example.newsapi.exception;

public class NewsNotFoundException extends RuntimeException{
    public NewsNotFoundException() {
    }

    public NewsNotFoundException(String message) {
        super(message);
    }

    public NewsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NewsNotFoundException(Throwable cause) {
        super(cause);
    }

    public NewsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
