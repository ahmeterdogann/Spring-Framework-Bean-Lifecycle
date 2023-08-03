package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

public class BeanC {
    public BeanC() {
        System.out.println("BeanC()");
    }

    public void init() {
        System.out.println("BeanC init()");
    }

    public void destroy() {
        System.out.println("BeanC destroy()");
    }
}
