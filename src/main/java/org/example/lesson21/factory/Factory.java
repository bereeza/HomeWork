package org.example.lesson21.factory;

import org.example.lesson21.db.DBStorage;
import org.example.lesson21.file_system.FileStorage;
import org.example.lesson21.in_memory.InMemoryStorage;
import org.example.lesson21.type.StorageType;

public class Factory {
    public Storage createIn(StorageType type) {
        switch (type) {
            case DB_STORAGE -> {
                return new DBStorage();
            }
            case FILE_SYSTEM -> {
                return new FileStorage();
            }
            case IN_MEMORY -> {
                return new InMemoryStorage();
            }
        }
        throw new RuntimeException("Something went wrong.");
    }
}