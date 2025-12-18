package com.Projeto.ecommerce_cart.repository;

import com.Projeto.ecommerce_cart.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item,Long> {


    @Override
    Optional<Item> findById(Long id);
}