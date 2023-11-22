package com.example.springapp.repository;

import com.example.springapp.exception.IdNotFoundException;
import com.example.springapp.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IdNotFoundException("Something went wrong. Check id " + id));
    }
}
