package com.Projeto.ecommerce_cart.service;

import com.Projeto.ecommerce_cart.dto.DtoRequest;
import com.Projeto.ecommerce_cart.exception.CartNotFoundException;
import com.Projeto.ecommerce_cart.exception.ProductNotFoundException;
import com.Projeto.ecommerce_cart.model.Item;
import com.Projeto.ecommerce_cart.repository.CartRepository;
import com.Projeto.ecommerce_cart.repository.ProductRepository;
import com.Projeto.ecommerce_cart.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private CartRepository cartRepo;
    private ProductRepository productRepo;
    private UserRepository userRepo;

    public CartService(CartRepository cartRepo, ProductRepository productRepo, UserRepository userRepo) {
        this.cartRepo = cartRepo;
        this.productRepo = productRepo;
        this.userRepo = userRepo;
    }




    public void adicionarItem(DtoRequest dto) {

        var cart = cartRepo.findById(dto.cartId)
                .orElseThrow(() -> new CartNotFoundException("Cart Not found: " + dto.cartId));


        var product = productRepo.findById(dto.productId)
                .orElseThrow(() -> new ProductNotFoundException("Product Not found: " + dto.productId));


        Item item = new Item(product, dto.quantity);
        item.setCart(cart);
        cart.getItems().add(item);
        cartRepo.save(cart);



    public void itemDelete(DtoDelete dtoDelite) {

    }

               itemRepository.delete(delete);

    }
}
