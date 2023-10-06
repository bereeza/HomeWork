package org.example.lesson16.task1;

public interface ThreadSafeList<T> {
    void add(T element);
    void remove(T element);
    void removeByIndex(int index);
    T get(int index);
}
