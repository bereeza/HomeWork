package org.example.lesson13.coffee.order;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private static int counter = 1;
    private int number;
    private String name;

    public Order(String name) {
        this.name = name;
        this.number = counter++;
    }

    @Override
    public String toString() {
        return "\nnum: " + number +
                "| name: " + name;
    }
}
