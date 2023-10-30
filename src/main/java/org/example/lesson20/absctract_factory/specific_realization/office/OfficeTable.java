package org.example.lesson20.absctract_factory.specific_realization.office;

import org.example.lesson20.absctract_factory.product.Table;

public class OfficeTable implements Table {
    @Override
    public void create() {
        System.out.println("Create an office table!");
    }
}
