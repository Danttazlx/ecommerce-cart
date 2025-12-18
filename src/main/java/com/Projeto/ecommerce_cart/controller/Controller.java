package com.Projeto.ecommerce_cart.controller;

import com.Projeto.ecommerce_cart.dto.DtoRequest;
import com.Projeto.ecommerce_cart.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    private CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping("/item")  // ← barra também
    public ResponseEntity<Void> adicionarItem(@RequestBody DtoRequest dto) {
        service.adicionarItem(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}