package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class BeanB {
    public BeanB() {
        System.out.println("BeanB()");
    }

    @PostConstruct
    public void init() {
        System.out.println("BeanB init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BeanB destroy()");
    }
}
