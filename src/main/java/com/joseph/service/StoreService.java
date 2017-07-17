package com.joseph.service;

import com.joseph.dto.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Service
public class StoreService {

//    @Autowired
//    private ShoppingCart shoppingCart;

    public ShoppingCart setCartName(String name) {
        return new ShoppingCart(name);
//        shoppingCart.setName(name);
//        return shoppingCart;
    }

//    public ShoppingCart getCart() {
//        return shoppingCart;
//    }
}
