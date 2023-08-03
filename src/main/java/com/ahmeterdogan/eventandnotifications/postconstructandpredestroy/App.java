package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        System.out.println("*******************");
        //context ayağa kalkarken B ve C init çalıştı ama tabiki olan prototype olan A çalışmadı çünkü contexten talep etmemiz lazım
        BeanA beanA = (BeanA) applicationContext.getBean("beanA");

        BeanB beanB = (BeanB) applicationContext.getBean("beanB");
        System.out.println("Time at inject : " + beanB.getTimeAtInject());
        System.out.println("Time at post construct : " + beanB.getTimeAtPostConstruct()); //Burdan şunu anlıyorsun bean yaratılıyor injectler yapılıyor postconstruct metodu öyle çalışıyor

        System.out.println("*******************");
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) applicationContext.getBeanFactory();
        beanDefinitionRegistry.removeBeanDefinition("beanC");
        beanDefinitionRegistry.removeBeanDefinition("beanB");
        beanDefinitionRegistry.removeBeanDefinition("beanA"); //pre destroy çağrılmadı çünkü spring protoype bean'lerin yaşam döngüsü spring tarafından yönetilmez

    }
}
