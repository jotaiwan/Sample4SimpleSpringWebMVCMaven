package com.joseph.controller;

import com.joseph.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Controller
@RequestMapping("/shoppingcart")
public class ShoppingCartController {

    @Autowired
    private StoreService storeService;

    @RequestMapping(value="/{name}", method= RequestMethod.GET)
    public String createShoppingCart(@PathVariable("name") String name, Model model) {
        model.addAttribute("shoppingCart", storeService.setCartName(name));
        return "shoppingCart";
    }
}
