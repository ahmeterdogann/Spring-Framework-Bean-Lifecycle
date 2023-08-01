package com.ahmeterdogan.eventandnotifications.refresh;


import com.ahmeterdogan.other.BeanInOtherPackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@ComponentScan
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        BeanA a1 = (BeanA) applicationContext.getBean("beanA");
        applicationContext.scan("com.ahmeterdogan.eventandnotifications.refresh");
        BeanA a2 = (BeanA) applicationContext.getBean("beanA");
        System.out.println(a1 == a2);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("*************************");
        applicationContext.register(BeanInOtherPackage.class);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("*************************");

        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext();
        xmlApplicationContext.setConfigLocation("file:/Users/ahmeterdog4n/Desktop/MySpace/IT/IdeaProjects/SpringFrameworkBeanLifecycle/src/main/java/com/ahmeterdogan/eventandnotifications/refresh/refreshconfig.xml");
        xmlApplicationContext.refresh();
        Arrays.stream(xmlApplicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("****************************");
        BeanB b1 = (BeanB) xmlApplicationContext.getBean("beanB");
        xmlApplicationContext.setConfigLocation("file:/Users/ahmeterdog4n/Desktop/MySpace/IT/IdeaProjects/SpringFrameworkBeanLifecycle/src/main/java/com/ahmeterdogan/eventandnotifications/refresh/refreshconfig.xml");
        xmlApplicationContext.refresh();
        BeanB b2 = (BeanB) xmlApplicationContext.getBean("beanB");
        System.out.printf("BURAYA DİKKAT xml config contexte refresh sonrası farklı bean geldi b1 == b2 -> %b", b1 == b2);
    }
}
