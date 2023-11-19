package com.example.tomcatpractice.dao;

import com.example.tomcatpractice.entity.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDao {
    public static Map<Integer, Product> PRODUCT = new HashMap<>();

    // fill the map with default values
    static {
        ProductDao.PRODUCT.put(1, new Product(1, "SmartPhone", 1123.23));
        ProductDao.PRODUCT.put(2, new Product(2, "Tomato", 23.23));
        ProductDao.PRODUCT.put(3, new Product(3, "Potato", 20));
    }
}
