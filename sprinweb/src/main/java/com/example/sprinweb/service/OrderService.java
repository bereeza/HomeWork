package com.example.sprinweb.service;

import com.example.sprinweb.model.Order;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService{
    private final Map<Integer, Order> orders = new HashMap<>();

    public Order getById(int id) {
        return orders.get(id);
    }

    public Map<Integer, Order> getAll() {
        return orders;
    }

    public Order add(Order order) {
        return orders.put(order.getId(), order);
    }
}
