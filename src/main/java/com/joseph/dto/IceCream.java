package com.joseph.dto;

import com.joseph.annotation.Cold;
import com.joseph.annotation.Creamy;
import org.springframework.stereotype.Component;

/**
 * Created by jotaiwan on 13/07/2017.
 */
@Component
@Cold
@Creamy
public class IceCream implements Dessert {
    private String flavor;
    private String size;

    public String description() {
        return "This is Icecream";
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
