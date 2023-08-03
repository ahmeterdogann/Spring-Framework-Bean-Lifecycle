package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CallBackMethodsConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanC beanC() {
        return new BeanC();
    }
}
