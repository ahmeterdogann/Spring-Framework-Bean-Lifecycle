package com.ahmeterdogan.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public class App {
    List<OrderableBean> beans;

    @Autowired
    public App(List<OrderableBean> beans) {
        this.beans = beans;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);

        //Çıktıyı incelediğinde @Other'ın bean init'inde bir etkisi yok.
        //Ama beans collection'ına inject edilme sırasında etkisi vardır.

         App app = (App) applicationContext.getBean("app");
         System.out.println();
         app.beans.stream().forEach(System.out::println);
    }

}
