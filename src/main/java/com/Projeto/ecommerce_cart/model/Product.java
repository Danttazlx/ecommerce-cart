package com.Projeto.ecommerce_cart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private Integer quantity;
    private BigDecimal price;
    private String description;

    @OneToMany(mappedBy = "product_id")
    private List<Item> items;


}
