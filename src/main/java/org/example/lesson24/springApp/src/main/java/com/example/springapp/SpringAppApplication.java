package com.example.springapp;

import com.example.springapp.model.Product;
import com.example.springapp.repository.Cart;
import com.example.springapp.repository.ProductRepository;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringAppApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(SpringAppApplication.class, args);
        final ProductRepository repo = run.getBean(ProductRepository.class);
        final Cart cart = run.getBean(Cart.class);
        repo.getAllProducts().add(new Product(1, "Tomato", 20));
        repo.getAllProducts().add(new Product(2, "Milk", 15));
        repo.getAllProducts().add(new Product(3, "Cereal", 35));

        cart.addProduct(repo.getProductById(1));
        cart.addProduct(repo.getProductById(2));
        // Cart contents: Cart(cart=[Product(id=1, name=Tomato, cost=20.0), Product(id=2, name=Milk, cost=15.0)])
        System.out.println("Cart contents: " + cart);

        cart.removeProductById(repo.getProductById(1));
        // Cart contents: Cart(cart=[Product(id=2, name=Milk, cost=15.0)])
        System.out.println("Cart contents: " + cart);

        List<Product> products = List.of(new Product(4, "Juice", 40.50),
                new Product(5, "Banana", 22.13));

        cart.addProductList(products);
        // Cart contents: Cart(cart=[Product(id=2, name=Milk, cost=15.0), Product(id=4, name=Juice, cost=40.5), Product(id=5, name=Banana, cost=22.13)])
        System.out.println("Cart contents: " + cart);
    }
}