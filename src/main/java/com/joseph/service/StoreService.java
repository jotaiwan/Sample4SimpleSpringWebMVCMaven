package com.joseph.service;

import com.joseph.dto.ShoppingCart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Service
public class StoreService {

    private static final Logger logger = LoggerFactory.getLogger(StoreService.class);
//    @Autowired
//    private ShoppingCart shoppingCart;

    public ShoppingCart setCartName(String name) {
        ShoppingCart shoppintCart = new ShoppingCart(name);
        logger.info("Shopping session: " + shoppintCart.hashCode());
        return shoppintCart;
//        shoppingCart.setName(name);
//        return shoppingCart;
    }

//    public ShoppingCart getCart() {
//        return shoppingCart;
//    }
}
