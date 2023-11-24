package com.example.sprinweb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@ToString
public class Order {
    @Getter
    private int id;
    @Getter
    private String date;
    private double cost;
    @Getter
    private List<Product> products;

    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getDate() {
        return LocalDateTime.now().toString();
    }

    public double getCost() {
        return products.stream().mapToDouble(Product::getCost).sum();
    }
}
