package org.example.lesson20.absctract_factory.specific_realization.office;

import org.example.lesson20.absctract_factory.product.Chair;

public class OfficeChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create an office chair!");
    }
}
