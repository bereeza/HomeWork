package org.example.lesson20.absctract_factory.specific_realization.home;

import org.example.lesson20.absctract_factory.product.Chair;

public class HomeChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create a home chair!");
    }
}
