package com.ahmeterdogan.lazyinjectproxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class Config {
    public Config() {
        System.out.println("Config()");
    }

    @Bean
    @Lazy(value = false) //Bunu diyince artık eager mode'a çevirdin ancak Config sınıfı nesnen @Lazy demene rağmen yaratıldı çünkü bean metodun non static
    public int val() {
        System.out.println("Config.val()");
        return 1;
    }

    @Bean
    public String str() {
        System.out.println("Config.str()");
        return "hello spring";
    }

    @Bean
    public BeanE beanE() {
        return new BeanE("autowired in no component class ex");
    }
}
