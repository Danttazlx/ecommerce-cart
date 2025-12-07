package com.Projeto.ecommerce_cart.repository;

import com.Projeto.ecommerce_cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
