package org.example.lesson27;

import org.example.lesson27.coffe.order.CoffeeOrderBoard;
import org.example.lesson27.coffe.order.Order;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        Order order = new Order("Petr");

        coffeeOrderBoard.add(order);
        coffeeOrderBoard.draw();

        List<Order> list = List.of(
                new Order("Artem"),
                new Order("Carl"));
        coffeeOrderBoard.addAll(list);
        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver(22);
        coffeeOrderBoard.draw();
    }
}
