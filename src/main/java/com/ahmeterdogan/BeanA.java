package com.ahmeterdogan;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy //Singleton bean'ler defaul eager yaratılıyordu  lazy yapabildin
public class BeanA {
    public BeanA() {
        System.out.println("A()");
    }

    public void doSth() {
        System.out.println("a.doSth()");
    }
}
