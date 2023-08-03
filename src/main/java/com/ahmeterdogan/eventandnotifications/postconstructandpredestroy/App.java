package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Arrays;

@ComponentScan
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        System.out.println("*******************");
        //context ayağa kalkarken B ve C init çalıştı ama tabiki olan prototype olan A çalışmadı çünkü contexten talep etmemiz lazım
        BeanA beanA = (BeanA) applicationContext.getBean("beanA");

        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) applicationContext.getBeanFactory();
        System.out.println("*******************");
        beanDefinitionRegistry.removeBeanDefinition("beanC");
        beanDefinitionRegistry.removeBeanDefinition("beanB");
        beanDefinitionRegistry.removeBeanDefinition("beanA"); //pre destroy çağrılmadı çünkü spring protoype bean'lerin yaşam döngüsü spring tarafından yönetilmez

    }
}
