package org.example.lesson27.coffe.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
    private static int counter = 1;
    private int number;
    private String name;

    public Order(String name) {
        this.name = name;
        this.number = counter++;
    }
}
