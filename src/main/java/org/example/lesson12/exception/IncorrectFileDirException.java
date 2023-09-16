package org.example.lesson12.exception;

public class IncorrectFileDirException extends RuntimeException {
    public IncorrectFileDirException() {
    }

    public IncorrectFileDirException(String message) {
        super(message);
    }

    public IncorrectFileDirException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectFileDirException(Throwable cause) {
        super(cause);
    }

    public IncorrectFileDirException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
