package org.example.lesson20.absctract_factory.specific_realization.home;

import org.example.lesson20.absctract_factory.product.Table;

public class HomeTable implements Table {
    @Override
    public void create() {
        System.out.println("Create a home chair!");
    }
}
