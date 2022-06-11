package com.micropos.carts.service;

import com.micropos.carts.model.Cart;

public interface CartsService {

    Cart add(Cart cart, String productId, int amount);

    Long checkout(Cart cart);
}
