package com.Projeto.ecommerce_cart.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "items")
@ToString(exclude = {"cart", "product"})
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    private Integer quantity;


    public Item() {
    }


    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }


    public void setCart(Cart cart) {
        this.cart = cart;
    }


    public Cart getCart() {
        return cart;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
