package org.example.lesson21.in_memory;

import org.example.lesson21.factory.Storage;

import java.util.List;

public class InMemoryStorage implements Storage {
    @Override
    public void store(String data) {
        System.out.println(data);
    }

    @Override
    public void store(List<String> data) {
        data.forEach(System.out::println);
    }
}
