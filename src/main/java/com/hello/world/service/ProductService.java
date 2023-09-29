package com.hello.world.service;

import com.hello.world.models.Product;
import com.hello.world.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {
        Product newProduct = productRepository.save(product);
        return ResponseEntity.ok(newProduct);
    }

    public ResponseEntity<List<Product>> fetchAllProducts()
    {
        return ResponseEntity.ok(productRepository.findAll());
    }
}
