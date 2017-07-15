package com.joseph.dto;

import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 13/07/2017.
 */
@Component
public class Cake implements Dessert {
    private String flavor;
    private String size;

    public String description() {
        return "Icecream flavor is " + flavor + " with " + size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
