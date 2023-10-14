package org.example.lesson17.Log;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LogConfiguration {
    private LoggingLevel lvl;
    private String format;

    public LogConfiguration(LoggingLevel lvl) {
        this.lvl = lvl;
        format = format(lvl);
    }

    public String format(LoggingLevel lvl) {
        final LocalDateTime time = LocalDateTime.now();
        if (lvl == LoggingLevel.DEBUG) {
            return "[" + time + "][DEBUG][INFO]";
        } else {
            return "[" + time + "][INFO]";
        }
    }

    @Override
    public String toString() {
        return "LVL: " + lvl +
                "\nFORMAT: " + format;
    }
}
