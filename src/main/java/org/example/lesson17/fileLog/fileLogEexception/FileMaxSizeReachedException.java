package org.example.lesson17.fileLog.fileLogEexception;

public class FileMaxSizeReachedException extends RuntimeException {
    public FileMaxSizeReachedException() {
    }

    public FileMaxSizeReachedException(String message) {
        super(message);
    }

    public FileMaxSizeReachedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileMaxSizeReachedException(Throwable cause) {
        super(cause);
    }

    public FileMaxSizeReachedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
