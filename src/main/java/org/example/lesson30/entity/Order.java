package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "cost")
    private double cost;

    @ManyToMany
    @JoinTable(
            name = "order_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    public Order(int id, List<Product> products) {
        this.id = id;
        this.date = getDate();
        this.cost = getCost();
        this.products = products;
    }

    public double getCost() {
        return products.stream().mapToDouble(Product::getCost).sum();
    }

    public String getDate() {
        return LocalDateTime.now().toString();
    }
}
