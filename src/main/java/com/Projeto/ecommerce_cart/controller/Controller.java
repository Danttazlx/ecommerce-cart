package com.Projeto.ecommerce_cart.controller;

import com.Projeto.ecommerce_cart.dto.DtoDelete;
import com.Projeto.ecommerce_cart.dto.DtoRequest;
import com.Projeto.ecommerce_cart.service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class Controller {

    private final CartService service;

    public Controller(CartService service) {
        this.service = service;
    }

    @PostMapping("/item")
    public ResponseEntity<Void> adicionarItem(@RequestBody DtoRequest dto) {
        service.adicionarItem(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("{Id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long Id) {
        service.removerProdutoDoCarrinho(Id);
        return ResponseEntity.noContent().build();
    }

}