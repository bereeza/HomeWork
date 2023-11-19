package com.example.tomcatpractice.service;

import java.util.Map;

public interface Repository<T> {
    T getById(int id);

    Map<Integer, T> getAll();
}
