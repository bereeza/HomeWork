package org.example.lesson21.factory;

import java.util.List;

public interface Storage {
    void store(String data);

    void store(List<String> data);
}
