package org.example.lesson17.stdoutLog;

import org.example.lesson17.Log.Logger;

public class StdoutLogger extends Logger {

    public StdoutLogger(StdoutLoggerConfiguration config) {
        super(config);
    }

    public void debug(String message) {
        super.debug(message);
    }

    public void info(String message) {
        super.info(message);
    }

    @Override
    public void logging(String message) {
        System.out.println(message);
    }
}
