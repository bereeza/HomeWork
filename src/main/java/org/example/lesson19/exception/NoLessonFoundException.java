package org.example.lesson19.exception;

public class NoLessonFoundException extends RuntimeException{
    public NoLessonFoundException() {
    }

    public NoLessonFoundException(String message) {
        super(message);
    }

    public NoLessonFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLessonFoundException(Throwable cause) {
        super(cause);
    }

    public NoLessonFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
