package com.security.springsecurity.controller;

import com.security.springsecurity.model.Product;
import com.security.springsecurity.service.product.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;
    private final static Logger LOGGER = Logger.getLogger(ProductService.class);

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    private ResponseEntity<List<Product>> getAllProducts() {
        LOGGER.info("All products:\n" + productService.findAll());
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Product>> getProductById(@PathVariable long id) {
        if (productService.findById(id).isEmpty()) {
            LOGGER.info("Product not found. Check id" + id);
            ResponseEntity.status(HttpStatus.NOT_FOUND);
        }
        LOGGER.info("Product:\n" + productService.findById(id));
        return ResponseEntity.status(HttpStatus.OK).body(productService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    private void deleteProductById(@PathVariable long id) {
        LOGGER.info("Delete product:\n" + productService.findById(id));
        productService.deleteById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        LOGGER.info("Add new product:\n" + product.getName());
        productService.add(product);
    }
}
