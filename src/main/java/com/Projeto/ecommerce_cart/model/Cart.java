package com.Projeto.ecommerce_cart.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.query.criteria.JpaOrder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "carts")
@ToString(exclude = "items")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @OneToOne
    @JoinColumn(name = "user_id", unique = true )
    private User user;


    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }
}
