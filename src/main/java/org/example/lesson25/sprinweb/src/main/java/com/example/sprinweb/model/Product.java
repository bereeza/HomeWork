package com.example.sprinweb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double cost;

    @Override
    public String toString() {
        return "id:\t" + id +
                "\nname:\t" + name +
                "\ncost:\t" + cost;
    }
}