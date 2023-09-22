package org.example.lesson13.coffee.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.lesson13.exception.IncorrectArgumentException;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class CoffeeOrderBoard {
    Deque<Order> clientsList = new LinkedList<>();

    public void add(Order order) {
        clientsList.add(order);
    }

    public void addAll(List<Order> list) {
        clientsList.addAll(list);
    }

    public Order deliver() {
        return clientsList.pollFirst();
    }

    public String deliver(int num) {
        return clientsList.stream()
                .filter(x -> x.getNumber() == num)
                .findFirst()
                .map(y -> {
                    clientsList.remove(y);
                    return clientsList.toString();
                }).orElseThrow(() -> new IncorrectArgumentException("Order " + num + " not found"));
    }

    public String draw() {
        return clientsList.toString();
    }

    @Override
    public String toString() {
        return "Num | Name:\n" +
                clientsList;
    }
}
