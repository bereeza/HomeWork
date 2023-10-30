package org.example.lesson20.absctract_factory.specific_realization.office;

import org.example.lesson20.absctract_factory.product.Door;

public class OfficeDoor implements Door {
    @Override
    public void create() {
        System.out.println("Create an office door!");
    }
}
