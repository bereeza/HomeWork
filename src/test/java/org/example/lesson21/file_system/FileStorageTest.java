package org.example.lesson21.file_system;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class FileStorageTest {
    private final FileStorage fileStorage = Mockito.mock(FileStorage.class);

    @Test
    public void testStringStore() {
        String data = "Test data";
        fileStorage.store(data);
        Mockito.verify(fileStorage, Mockito.times(1)).store(data);
    }

    @Test
    public void testListStore() {
        List<String> data = List.of("Data 1", "Data 2", "Data 3");
        fileStorage.store(data);
        Mockito.verify(fileStorage, Mockito.times(1)).store(data);
    }
}

