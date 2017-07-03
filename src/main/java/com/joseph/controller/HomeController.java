package com.joseph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jotaiwan on 3/07/2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String home() {
        return "home";
    }

}
