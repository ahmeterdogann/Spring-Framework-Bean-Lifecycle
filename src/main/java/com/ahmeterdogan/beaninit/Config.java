package com.ahmeterdogan.beaninit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public BeanB beanB2() {
        System.out.println("Config B2");
        return new BeanB();
    }

    @Bean
    public BeanB beanB3() {
        System.out.println("Config B3");
        return new BeanB();
    }

    @Bean
    public int i() {
        System.out.println("Config i");
        return 1;
    }

    @Bean
    public int j() {
        System.out.println("Config j");
        return 2;
    }

    @Bean
    public int k() {
        System.out.println("Config k");
        return 3;
    }

    @Bean
    public String a() {
        System.out.println("Config a");
       return "a";
    }

    @Bean
    public String b() {
        System.out.println("Config b");
       return "b";
    }

    @Bean
    public String c() {
        System.out.println("Config c");
       return "c";
    }


}
