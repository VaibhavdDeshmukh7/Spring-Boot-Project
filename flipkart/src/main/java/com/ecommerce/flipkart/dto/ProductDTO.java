package com.ecommerce.flipkart.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class ProductDTO {
    private long productId;
    private String productName;
    private String productDescription;
    private double price;
    private String category;
}
