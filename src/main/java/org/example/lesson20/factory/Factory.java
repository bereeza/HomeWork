package org.example.lesson20.factory;

import org.example.lesson20.factory.exception.WrongProductTypeException;
import org.example.lesson20.factory.products.Chair;
import org.example.lesson20.factory.products.Door;
import org.example.lesson20.factory.products.Table;
import org.example.lesson20.factory.productsType.ProductType;

public class Factory {
    public Furniture createFurniture(ProductType type) {
        switch (type) {
            case CHAIR -> {
                return new Chair();
            }
            case DOOR -> {
                return new Door();
            }
            case TABLE -> {
                return new Table();
            }
        }
        throw new WrongProductTypeException("Please, choose correct product type!");
    }
}
