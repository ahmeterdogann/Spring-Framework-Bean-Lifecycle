package com.ahmeterdogan;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy(value = false) //işlevsiz çünkü prototype nesneler istenildiği zaman çağrılır
public class BeanB {
    public BeanB() {
        System.out.println("B()");
    }

    public void doSth() {
        System.out.println("b.doSth()");
    }
}
