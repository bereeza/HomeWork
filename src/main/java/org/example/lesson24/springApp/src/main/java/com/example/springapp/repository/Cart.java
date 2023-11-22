package com.example.springapp.repository;

import com.example.springapp.exception.IdNotFoundException;
import com.example.springapp.model.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@ToString
public class Cart {
    List<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }

    public List<Product> addProductList(List<Product> productList) {
        cart.addAll(productList);
        return cart;
    }

    public void removeProductById(Product product) {
        cart.remove(cart.stream()
                .filter(p -> p.getId() == product.getId())
                .findFirst()
                .orElseThrow(() -> new IdNotFoundException("Something went wrong. Check id " + product.getId())));
    }
}