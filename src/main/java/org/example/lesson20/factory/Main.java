package org.example.lesson20.factory;

import org.example.lesson20.factory.productsType.ProductType;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        // The product began to be created
        // The chair is created!
        // The product began to be created
        // The doors is created!
        // The product began to be created
        // The table is created!
        factory.createFurniture(ProductType.CHAIR).create("The product began to be created\n");
        factory.createFurniture(ProductType.DOOR).create("The product began to be created\n");
        factory.createFurniture(ProductType.TABLE).create("The product began to be created\n");
    }
}
