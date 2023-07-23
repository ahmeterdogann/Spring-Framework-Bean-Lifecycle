package com.ahmeterdogan;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanE {
    private String str;

    @Autowired
    public BeanE(String str) {
        this.str = str;
    }
}
