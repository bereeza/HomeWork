package org.example.lesson17.Log;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.lesson17.Log.exception.IncorrectConfigException;

@Getter
@Setter
@AllArgsConstructor
public abstract class Logger {
    private LogConfiguration config;

    public void debug(String message) {
        if (config.getLvl().equals(LoggingLevel.DEBUG)) {
            message = config.format(LoggingLevel.DEBUG) + message;
            logging(message);
        } else {
            throw new IncorrectConfigException("Change Log lvl to continue work!");
        }
    }

    public void info(String message) {
        if (config.getLvl().equals(LoggingLevel.INFO)) {
            message = config.format(LoggingLevel.INFO) + message;
            logging(message);
        } else {
            throw new IncorrectConfigException("Change Log lvl to continue work!");
        }
    }

    public abstract void logging(String message);
}
