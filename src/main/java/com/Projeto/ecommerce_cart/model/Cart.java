package com.Projeto.ecommerce_cart.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @OneToOne
    @JoinColumn(name = "user_id", unique = true )
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @OneToMany(mappedBy = "cart_id",cascade = CascadeType.REMOVE)
    private List<Item> items = new ArrayList<>();




}
