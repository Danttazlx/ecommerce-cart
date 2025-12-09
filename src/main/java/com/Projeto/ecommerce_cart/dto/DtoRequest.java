package com.Projeto.ecommerce_cart.dto;


import lombok.Data;

@Data
public class DtoRequest  {


    public Long productId;
    public Long userId;
    public Long cartId;
    public Integer quantity;

}
