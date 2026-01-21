package com.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String id;
    private String name;
    private String email;
    private Product favoriteProduct;
    
    public void setFavoriteProduct(Product product) {
        this.favoriteProduct = product;
    }
}
