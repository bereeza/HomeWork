package com.example.tomcatpractice;

import com.example.tomcatpractice.entity.Order;
import com.example.tomcatpractice.entity.Product;
import com.example.tomcatpractice.service.OrderRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list1 = List.of(new Product(1, "Product1", 12.12), new Product(2, "Product2", 21.21));
        OrderRepository repo = new OrderRepository();
        repo.add(new Order(1, list1));
        System.out.println(repo.getById(1).getProducts().get(1));
    }
}
