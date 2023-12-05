package org.example.lesson27.coffe.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

@Getter
@Setter
@NoArgsConstructor
public class CoffeeOrderBoard implements CoffeeOrder {
    Deque<Order> clientsDeque = new LinkedList<>();
    private final static Logger LOGGER = Logger.getLogger(CoffeeOrderBoard.class);

    public void addAll(List<Order> list) {
        LOGGER.info("Add new clients.");
        clientsDeque.addAll(list);
        LOGGER.info("Result: " + clientsDeque);
    }

    @Override
    public void add(Order order) {
        LOGGER.info("Add new client.");
        clientsDeque.add(order);
        LOGGER.info(order + " has been added.");
    }

    @Override
    public Order deliver() {
        Order deliveredOrder = clientsDeque.pollFirst();
        if (deliveredOrder != null) {
            LOGGER.info("Ready order for " + deliveredOrder);
        } else {
            LOGGER.info("No orders to deliver.");
        }
        return deliveredOrder;
    }

    @Override
    public void deliver(int num) {
        try {
            Order removedOrder = clientsDeque.stream()
                    .filter(x -> x.getNumber() == num)
                    .findFirst()
                    .orElseThrow(() -> new NoSuchElementException("Order " + num + " not found."));

            clientsDeque.remove(removedOrder);
            LOGGER.info("The customer with the number " + num + " received the order.");
        } catch (NoSuchElementException e) {
            LOGGER.error("Error delivering order", e);
        }
    }

    @Override
    public Deque<Order> draw() {
        LOGGER.info("Current deque: " + clientsDeque);
        return clientsDeque;
    }
}
