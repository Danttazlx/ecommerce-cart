package com.Projeto.ecommerce_cart.repository;

import com.Projeto.ecommerce_cart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoy extends JpaRepository<User,Long> {


}
