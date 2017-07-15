package com.joseph.controller;

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
    private Dessert dessert;

    @RequestMapping(value="/default")
    public String defaultDessert(Model model) {
        model.addAttribute("defaultDessert", dessert.description());
        return "dessert";
    }
}
