package org.example.lesson17.fileLog;

import lombok.Getter;
import lombok.Setter;
import org.example.lesson17.Log.LogConfiguration;
import org.example.lesson17.Log.LoggingLevel;

import java.io.File;

@Getter
@Setter
public class FileLoggerConfiguration extends LogConfiguration {
    private File file;
    private final long size = 100;

    public FileLoggerConfiguration(LoggingLevel lvl, File file) {
        super(lvl);
        this.file = file;
    }

    @Override
    public String format(LoggingLevel lvl) {
        return super.format(lvl);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFILE: " + file.getAbsolutePath() +
                "\nMAX-SIZE: " + size;
    }
}
