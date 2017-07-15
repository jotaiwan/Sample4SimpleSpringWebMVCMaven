package com.joseph.controller;

import com.joseph.annotation.Cold;
import com.joseph.annotation.Fruity;
import com.joseph.dto.Dessert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jotaiwan on 15/07/2017.
 */
@Controller
@RequestMapping("/dessert")
public class DessertController {

    @Autowired
    @Cold
    @Fruity
    private Dessert dessert;

    @RequestMapping(value="/default")
    public String defaultDessert(Model model) {
        model.addAttribute("defaultDessert", dessert.description());
        return "dessert";
    }
}
