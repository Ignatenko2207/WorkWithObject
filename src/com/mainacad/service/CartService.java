package com.mainacad.service;

import com.mainacad.model.Cart;

public class CartService {

    public static Double getTotalSum(Cart cart){
        return cart.getOrder().getAmount() * cart.getOrder().getItem().getPrice();
    }
}
