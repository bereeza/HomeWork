package org.example.lesson20.absctract_factory;

import org.example.lesson20.absctract_factory.factory.FurnitureFactory;
import org.example.lesson20.absctract_factory.factory.specific_factory.HomeFurnitureFactory;
import org.example.lesson20.absctract_factory.factory.specific_factory.OfficeFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory homeFactory = new HomeFurnitureFactory();
        // Create a home chair!
        homeFactory.createChair().create();

        FurnitureFactory officeFactory = new OfficeFurnitureFactory();
        // Create an office door!
        // Create an office table!
        officeFactory.createDoor().create();
        officeFactory.createTable().create();
    }
}
