package com.Projeto.ecommerce_cart.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "item")
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Product product;
    private Integer quantity;


    public Item() {
    }

    public Item(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;

    }


}
