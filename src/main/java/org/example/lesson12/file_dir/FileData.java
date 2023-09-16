package org.example.lesson12.file_dir;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class FileData {
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 250;
    private String name;
    private int size;
    private String path;

    public FileData(String name, String path) {
        this.name = name;
        this.path = path;
        size = generateSize();
    }

    private int generateSize() {
        Random r = new Random();
        return r.nextInt(MIN_SIZE, MAX_SIZE);
    }
}
