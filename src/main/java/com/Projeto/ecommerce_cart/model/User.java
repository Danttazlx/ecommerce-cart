package com.Projeto.ecommerce_cart.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @OneToOne(mappedBy = "user_id")
    private Cart cart;


    private String name;
    private String email;
    private String password;


}
