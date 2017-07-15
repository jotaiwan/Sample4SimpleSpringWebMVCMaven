package com.joseph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jotaiwan on 3/07/2017.
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping(value="/{pageId}", method= RequestMethod.GET)
    public String page(
            @PathVariable("pageId") long pageId,
            Model model) {
        model.addAttribute("pageId", pageId);
        return "page";
    }
}
