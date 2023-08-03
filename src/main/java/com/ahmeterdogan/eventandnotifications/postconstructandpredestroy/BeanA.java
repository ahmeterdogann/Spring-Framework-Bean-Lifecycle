package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanA {
    public BeanA() {
        System.out.println("BeanA()");
    }

    @PostConstruct
    public void init() {
        System.out.println("BeanA init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BeanA destroy()");
    }
}
