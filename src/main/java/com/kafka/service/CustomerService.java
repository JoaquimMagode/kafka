package com.kafka.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kafka.model.Customer;


@Service
public class CustomerService {
    List<Customer> customers = Arrays.asList(
        new Customer("1", "Alice", "alice@example.com", null),
        new Customer("2", "Bob", "bob@example.com", null)
    );

    public List<Customer> getAllCustomers() {
        return customers;
    }
}

