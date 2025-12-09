package com.Projeto.ecommerce_cart.exception;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
