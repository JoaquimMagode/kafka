package com.kafka.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kafka.model.Product;
@Service
public class ProductService {

    List<Product> products = Arrays.asList(
        new Product("1", "Laptop", 999.99),
        new Product("2", "Smartphone", 499.99),
        new Product("3", "Tablet", 299.99)
    );

    public List<Product> getAllProducts() {
        return products;
    }
}
