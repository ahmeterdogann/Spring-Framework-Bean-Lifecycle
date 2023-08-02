package com.ahmeterdogan.eventandnotifications.close;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;
import java.util.Arrays;

@ComponentScan
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("************************************");
        applicationContext.close();
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("************************************");
//        LocalDateTime now = (LocalDateTime) applicationContext.getBean("nowBean"); //HATA verir context has been closed already
//        System.out.println(now);

        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(App.class);
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) applicationContext1.getBeanFactory();
        beanDefinitionRegistry.removeBeanDefinition("nowBean");
        Arrays.stream(applicationContext1.getBeanDefinitionNames()).forEach(System.out::println); //nowBean çıkarıldı
        System.out.println("************************************");


   }
}
