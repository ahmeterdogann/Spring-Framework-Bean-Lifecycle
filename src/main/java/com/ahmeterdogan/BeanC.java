package com.ahmeterdogan;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanC {
    public BeanC() {
        System.out.println("C()");
    }

    public void doSth() {
        System.out.println("c.doSth()");
    }
}
