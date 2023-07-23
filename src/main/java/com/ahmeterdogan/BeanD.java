package com.ahmeterdogan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanD {
    private BeanC beanC;


    @Autowired
    @Lazy
    public BeanD(BeanC beanC) {
        System.out.println("D(C c)");
        beanC.doSth(); //sen bunu demeyene kadar C() çalışmadı dikkat proxt pattern kullanılıyor
        this.beanC = beanC;
    }

    public void doSth() {
        System.out.println("d.doSth()");
    }
}
