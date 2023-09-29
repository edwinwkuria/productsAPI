package com.hello.world.controllers;

import com.hello.world.models.Product;
import com.hello.world.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }
    @PostMapping("/")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {
        return  productService.saveProduct(product);
    }
    @GetMapping("/")
    public ResponseEntity<List<Product>> getProducts()
    {
        return productService.fetchAllProducts();
    }
}
