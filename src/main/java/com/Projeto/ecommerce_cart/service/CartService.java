package com.Projeto.ecommerce_cart.service;
import com.Projeto.ecommerce_cart.dto.DtoRequest;
import com.Projeto.ecommerce_cart.exception.CartNotFoundException;
import com.Projeto.ecommerce_cart.exception.DeleteNotFoundException;
import com.Projeto.ecommerce_cart.exception.ProductNotFoundException;
import com.Projeto.ecommerce_cart.model.Item;
import com.Projeto.ecommerce_cart.repository.CartRepository;
import com.Projeto.ecommerce_cart.repository.ItemRepository;
import com.Projeto.ecommerce_cart.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final ItemRepository itemRepository;

    public CartService(CartRepository cartRepo, ProductRepository productRepo, ItemRepository itemRepo) {
        this.cartRepository = cartRepo;
        this.productRepository = productRepo;
        this.itemRepository = itemRepo;
    }


    public void adicionarItem(DtoRequest dto) {

        var cart = cartRepository.findById(dto.cartId)
                .orElseThrow(() -> new CartNotFoundException("Cart Not found: " + dto.cartId));


        var product = productRepository.findById(dto.productId)
                .orElseThrow(() -> new ProductNotFoundException("Product Not found: " + dto.productId));


        Item item = new Item(product, dto.quantity);
        item.setCart(cart);
        cart.getItems().add(item);
        cartRepository.save(cart);
    }


    public void removerProdutoDoCarrinho(Long Id) {
        var delete = itemRepository.findById(Id)
                .orElseThrow(() -> new DeleteNotFoundException("Product Not Found"));
               itemRepository.delete(delete);

    }
}
