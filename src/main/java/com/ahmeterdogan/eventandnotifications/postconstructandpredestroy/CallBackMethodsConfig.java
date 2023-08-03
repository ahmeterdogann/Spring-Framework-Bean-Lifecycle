package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CallBackMethodsConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanC beanC() {
        return new BeanC();
    }


    @Bean
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
