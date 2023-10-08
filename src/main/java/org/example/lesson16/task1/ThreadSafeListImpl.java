package org.example.lesson16.task1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ThreadSafeListImpl<T> implements ThreadSafeList<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public synchronized void add(T element) {
        list.add(element);
    }

    @Override
    public synchronized void remove(T element) {
        list.remove(element);
    }

    @Override
    public synchronized void removeByIndex(int index) {
        list.remove(index);
    }

    @Override
    public synchronized T get(int index) throws IndexOutOfBoundsException {
        return list.get(index);
    }
}