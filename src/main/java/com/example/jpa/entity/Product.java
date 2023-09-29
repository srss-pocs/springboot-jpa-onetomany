package com.example.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Product {

    @Id
    private int pid;
    private String productName;
    private int qty;
    private int price;
    
}
