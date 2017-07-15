package com.joseph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jotaiwan on 9/07/2017.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping(value="/all")
    public String product() {
        return "product";
    }
}
