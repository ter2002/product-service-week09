package com.example.productservice.event;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductCreatedEvent {
    private String productID;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
