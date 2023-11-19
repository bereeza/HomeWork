package com.example.tomcatpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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