package org.example.lesson14.shop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private static int counter = 1;

    private Type type;
    private double price;
    private boolean discount;
    private LocalDateTime date;

    public Product(Type type, double price, boolean discount) {
        id = counter++;
        this.type = type;
        this.price = price;
        this.discount = discount;
        date = LocalDateTime.now();
    }


}
