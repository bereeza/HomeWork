package com.example.sprinweb.controller;

import com.example.sprinweb.model.Order;
import com.example.sprinweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getById")
    public Order getOrderById(@RequestParam int id) {
        return orderService.getById(id);
    }

    @GetMapping("/getOrders")
    public Map<Integer, Order> getAllOrder() {
        return orderService.getAll();
    }

    @PostMapping("/addOrder")
    public void addOrder(@RequestBody Order order) {
        orderService.add(order);
    }
}