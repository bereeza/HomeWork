package org.example.lesson21.in_memory;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class InMemoryStorageTest {
    private final InMemoryStorage inMemoryStorage = Mockito.mock(InMemoryStorage.class);

    @Test
    public void testStringStore() {
        String data = "data";
        inMemoryStorage.store(data);
        Mockito.verify(inMemoryStorage, Mockito.times(1)).store(data);
    }

    @Test
    public void testListStore() {
        List<String> data = List.of("data1", "data2", "data3");
        inMemoryStorage.store(data);
        Mockito.verify(inMemoryStorage, Mockito.times(1)).store(data);
    }
}