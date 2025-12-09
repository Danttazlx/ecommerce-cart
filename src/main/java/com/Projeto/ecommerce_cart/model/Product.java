package com.Projeto.ecommerce_cart.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "products")
@ToString(exclude = "items")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer quantity;
    private BigDecimal price;
    private String description;

    @OneToMany(mappedBy = "product")
    private List<Item> items;
}