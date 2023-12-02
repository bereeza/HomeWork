package com.example.newsapi.model;

import java.util.Map;

public interface Model<T> {
    T getById(int id);
    Map<Integer, T> getAll();
}
