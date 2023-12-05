package org.example.lesson27.coffe.order;


import java.util.Deque;

public interface CoffeeOrder {
    void add(Order order);

    Order deliver();

    void deliver(int num);

    Deque<Order> draw();
}
