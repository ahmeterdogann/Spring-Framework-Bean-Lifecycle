package com.ahmeterdogan.beaninit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private BeanB beanB;
    private BeanB beanB2;
    @Autowired
    private BeanB beanB3;

    private int i;
    private int j;
    @Autowired
    private int k;

    private String a;
    private String b;
    @Autowired
    private String c;

    @Autowired
    public BeanA(BeanB beanB, int i, String a) {
        System.out.println("A(B,i,a)");
        this.beanB = beanB;
        this.i = i;
        this.a = a;
        System.out.println(toString());
    }

    @Autowired
    public void setBeanB2(BeanB beanB2) {
        this.beanB2 = beanB2;
        System.out.println(toString());
    }

    @Autowired
    public void setJ(int j) {
        this.j = j;
        System.out.println(toString());
    }

    @Autowired
    public void setB(String b) {
        this.b = b;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "beanB1=" + beanB +
                ", beanB2=" + beanB2 +
                ", beanB3=" + beanB3 +
                ", i=" + i +
                ", j=" + j +
                ", k=" + k +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
