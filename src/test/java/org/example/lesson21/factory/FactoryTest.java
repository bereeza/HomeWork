package org.example.lesson21.factory;

import org.example.lesson21.db.DBStorage;
import org.example.lesson21.file_system.FileStorage;
import org.example.lesson21.in_memory.InMemoryStorage;
import org.example.lesson21.type.StorageType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FactoryTest {
    private Factory factory;

    @Before
    public void setUp() {
        factory = new Factory();
    }

    @Test
    public void testCreateStorageWithDBType() {
        Storage dbStorage = factory.createIn(StorageType.DB_STORAGE);
        assertTrue(dbStorage instanceof DBStorage);
    }

    @Test
    public void testCreateStorageWithFileSystemType() {
        Storage fileStorage = factory.createIn(StorageType.FILE_SYSTEM);
        assertTrue(fileStorage instanceof FileStorage);
    }

    @Test
    public void testCreateStorageWithInMemoryType() {
        Storage inMemoryStorage = factory.createIn(StorageType.IN_MEMORY);
        assertTrue(inMemoryStorage instanceof InMemoryStorage);
    }
}