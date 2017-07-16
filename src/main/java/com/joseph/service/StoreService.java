package com.joseph.service;

import com.joseph.dto.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Service
public class StoreService {

    public ShoppingCart createShoppingCart(String name) {
        return new ShoppingCart(name);
    }
}
