package org.example.lesson21;

import org.example.lesson21.factory.Factory;
import org.example.lesson21.type.StorageType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        List<String> list = List.of("test 1", "test 2", "test 3");
        // 1,test msg
        // 2,tgawsdjfghkl
        // 3,test 1
        // 4,test 2
        // 5,test 3
        // factory.createIn(StorageType.DB_STORAGE).store("tgawsdjfghkl");
        // factory.createIn(StorageType.DB_STORAGE).store(list);

        // 2023-11-01T17_13_00.177617.txt
        // test 1
        // test 2
        // test 3

        // 2023-11-01T17_13_00.174618100.txt
        // file message
        // factory.createIn(StorageType.FILE_SYSTEM).store("file message");
        // factory.createIn(StorageType.FILE_SYSTEM).store(list);

        // in memory message
        // test 1
        // test 2
        // test 3
        // factory.createIn(StorageType.IN_MEMORY).store("in memory message");
        // factory.createIn(StorageType.IN_MEMORY).store(list);
    }
}
