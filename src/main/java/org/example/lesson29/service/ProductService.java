package com.security.springsecurity.service.product;

import com.security.springsecurity.model.Product;
import com.security.springsecurity.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void add(Product entity) {
        productRepository.save(entity);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }
}
