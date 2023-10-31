package org.example.lesson20.factory.products;

import org.example.lesson20.factory.Furniture;

public class Table implements Furniture {
    @Override
    public void create(String msg) {
        System.out.println(msg + "The table is created!");
    }
}
