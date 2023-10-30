package org.example.lesson20.absctract_factory.factory;

import org.example.lesson20.absctract_factory.product.Chair;
import org.example.lesson20.absctract_factory.product.Door;
import org.example.lesson20.absctract_factory.product.Table;

public interface FurnitureFactory {
    Table createTable();
    Door createDoor();
    Chair createChair();
}
