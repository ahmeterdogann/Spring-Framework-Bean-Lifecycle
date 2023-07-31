package com.ahmeterdogan.dependson;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanA {
    public BeanA() {
        System.out.println("A()");
    }
}
