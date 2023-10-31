package org.example.lesson20.factory.products;

import org.example.lesson20.factory.Furniture;

public class Door implements Furniture {
    @Override
    public void create(String msg) {
        System.out.println(msg + "The doors is created!");
    }
}
