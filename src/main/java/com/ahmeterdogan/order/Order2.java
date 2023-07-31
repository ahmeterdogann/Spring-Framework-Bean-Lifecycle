package com.ahmeterdogan.order;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Order2 implements OrderableBean{
    public Order2() {
        System.out.println("Order2()");
    }
}
