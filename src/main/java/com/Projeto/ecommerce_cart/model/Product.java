package com.Projeto.ecommerce_cart.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int quantity;
    private double price;
    private  String description;








}
