package com.Projeto.ecommerce_cart.exception;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException(String message) {
        super(message);
    }
}
