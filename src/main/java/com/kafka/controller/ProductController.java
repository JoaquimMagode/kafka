package com.kafka.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.Product;
import com.kafka.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    
    @RequestMapping("/products")
    public List<Product>  getAllProducts() {
        // Implementation to retrieve all products
        return productService.getAllProducts();
    }
    
}
