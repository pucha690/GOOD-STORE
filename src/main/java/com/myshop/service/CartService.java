package com.myshop.service;

import com.myshop.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
