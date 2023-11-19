package com.example.tomcatpractice.service;

import com.example.tomcatpractice.dao.ProductDao;
import com.example.tomcatpractice.entity.Product;
import com.example.tomcatpractice.exception.OrderNotFoundException;
import com.example.tomcatpractice.exception.ProductNotFoundException;

import java.util.Map;

public class ProductService implements Repository<Product> {

    @Override
    public Product getById(int id) {
        Product product = ProductDao.PRODUCT.get(id);
        if (product == null) {
            throw new ProductNotFoundException("Check product id:" + id);
        }
        return product;
    }

    @Override
    public Map<Integer, Product> getAll() {
        return ProductDao.PRODUCT;
    }
}
