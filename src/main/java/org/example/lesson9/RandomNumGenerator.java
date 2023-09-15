package org.example.lesson9;

public interface RandomNumGenerator<T extends Number> {
    T generateNum(T min, T max);
}
