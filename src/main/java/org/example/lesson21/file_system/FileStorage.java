package org.example.lesson21.file_system;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.lesson21.factory.Storage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FileStorage implements Storage {
    private final File file = generateFilename();

    @Override
    public void store(String data) {
        writeToFile(data, file);
    }

    @Override
    public void store(List<String> data) {
        for (String datum : data) {
            writeToFile(datum, file);
        }
    }

    private void writeToFile(String data, File file) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File generateFilename() {
        LocalDateTime now = LocalDateTime.now();
        String name = now.toString().replace(":", "_");
        return new File(name + ".txt");
    }
}
