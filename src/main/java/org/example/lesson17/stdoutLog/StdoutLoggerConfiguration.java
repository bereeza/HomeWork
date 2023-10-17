package org.example.lesson17.stdoutLog;

import org.example.lesson17.Log.LogConfiguration;
import org.example.lesson17.Log.LoggingLevel;

public class StdoutLoggerConfiguration extends LogConfiguration {

    public StdoutLoggerConfiguration(LoggingLevel lvl) {
        super(lvl);
    }

    @Override
    public String format(LoggingLevel lvl) {
        return super.format(lvl);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
