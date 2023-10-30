package org.example.lesson20.absctract_factory.factory.specific_factory;

import org.example.lesson20.absctract_factory.factory.FurnitureFactory;
import org.example.lesson20.absctract_factory.product.Chair;
import org.example.lesson20.absctract_factory.product.Door;
import org.example.lesson20.absctract_factory.product.Table;
import org.example.lesson20.absctract_factory.specific_realization.office.OfficeChair;
import org.example.lesson20.absctract_factory.specific_realization.office.OfficeDoor;
import org.example.lesson20.absctract_factory.specific_realization.office.OfficeTable;

public class OfficeFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new OfficeTable();
    }

    @Override
    public Door createDoor() {
        return new OfficeDoor();
    }

    @Override
    public Chair createChair() {
        return new OfficeChair();
    }
}
