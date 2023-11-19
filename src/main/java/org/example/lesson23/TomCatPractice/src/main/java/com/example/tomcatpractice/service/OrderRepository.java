package com.example.tomcatpractice.service;

import com.example.tomcatpractice.dao.OrderDao;
import com.example.tomcatpractice.entity.Order;
import com.example.tomcatpractice.exception.OrderNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService implements Repository<Order> {
    @Override
    public Order getById(int id) {
        Order order = OrderDao.ORDER.get(id);
        if (order == null) {
            throw new OrderNotFoundException("Order not found. Check order id: " + id);
        }
        return order;
    }

    @Override
    public Map<Integer, Order> getAll() {
        return OrderDao.ORDER;
    }

    public Order add(Order order) {
        return OrderDao.ORDER.put(order.getId(), order);
    }
}
