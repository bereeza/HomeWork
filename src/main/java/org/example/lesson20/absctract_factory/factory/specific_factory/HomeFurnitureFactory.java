package org.example.lesson20.absctract_factory.factory.specific_factory;

import org.example.lesson20.absctract_factory.factory.FurnitureFactory;
import org.example.lesson20.absctract_factory.product.Chair;
import org.example.lesson20.absctract_factory.product.Door;
import org.example.lesson20.absctract_factory.product.Table;
import org.example.lesson20.absctract_factory.specific_realization.home.HomeChair;
import org.example.lesson20.absctract_factory.specific_realization.home.HomeDoor;
import org.example.lesson20.absctract_factory.specific_realization.home.HomeTable;

public class HomeFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new HomeTable();
    }

    @Override
    public Door createDoor() {
        return new HomeDoor();
    }

    @Override
    public Chair createChair() {
        return new HomeChair();
    }
}
