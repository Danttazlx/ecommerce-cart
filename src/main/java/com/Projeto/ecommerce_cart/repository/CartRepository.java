package com.Projeto.ecommerce_cart.repository;

import com.Projeto.ecommerce_cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
