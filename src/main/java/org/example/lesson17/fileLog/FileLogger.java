package org.example.lesson17.fileLog;

import lombok.Getter;
import lombok.Setter;
import org.example.lesson17.Log.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@Getter
@Setter
public class FileLogger extends Logger {
    private FileLoggerConfiguration config;
    private long currentSize = 0;

    public FileLogger(FileLoggerConfiguration config) {
        super(config);
        this.config = config;
    }

    public void debug(String message) {
        super.debug(message);
    }

    public void info(String message) {
        super.info(message);
    }

    @Override
    public void logging(String s) {
        if (currentSize + s.length() > config.getSize()) {
//            throw new FileMaxSizeReachedException("Enough! File max size: " + config.getSize() +
//                    "\nCurrent size:" + currentSize);
            loggingWithNewFile(s);
        }

        writeToFile(s, config.getFile());
    }

    private void loggingWithNewFile(String s) {
        String logFileName = generateFileName();
        File newLogFile = new File(logFileName);
        config.setFile(newLogFile);
        currentSize = 0;
        writeToFile(s, newLogFile);
    }

    private void writeToFile(String s, File newLogFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(newLogFile, true))) {
            writer.println(s);
            currentSize += s.length();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String generateFileName() {
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.toString().replace(":", "_")
                .replace(".", "_");
        return "Log_" + formattedDateTime + ".txt";
    }
}
