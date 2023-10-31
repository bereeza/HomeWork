package org.example.lesson20.factory.products;

import org.example.lesson20.factory.Furniture;

public class Chair implements Furniture {
    @Override
    public void create(String msg) {
        System.out.println(msg + "The chair is created!");
    }
}
