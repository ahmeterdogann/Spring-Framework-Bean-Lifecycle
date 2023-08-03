package com.ahmeterdogan.eventandnotifications.registershotdownhook;


import com.ahmeterdogan.other.BeanInOtherPackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@ComponentScan
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);

        BeanA a = (BeanA) applicationContext.getBean("beanA");
        System.out.println(a);
        applicationContext.registerShutdownHook(); //JVM kapanmadan bana haber ver demek aslında thread oluşturuyor JVM kapanırken context'te kendini close ediyor.
        BeanA a1 = (BeanA) applicationContext.getBean("beanA"); //burda ulaşabilirsin hata vermez henüz JVM çalışıyor çünkü
        System.out.println(a1);
    }
}
