package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    private final static Logger LOGGER = Logger.getLogger(OrderController.class);

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/add")
    public ResponseEntity<Order> addOrder(@RequestBody Order entity) {
        LOGGER.info("New order: " + entity);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(orderService.addOrder(entity));
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        LOGGER.info("All orders: " + orderService.getAllOrders());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(orderService.getAllOrders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable long id) {
        LOGGER.info("Order by id: " + orderService.getOrderById(id));
        return orderService.getOrderById(id)
                .map(order -> ResponseEntity.status(HttpStatus.OK).body(order))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrderById(@PathVariable long id) {
        orderService.deleteOrderById(id);
        LOGGER.info("Order with id " + id + "deleted successfully");
    }
}
