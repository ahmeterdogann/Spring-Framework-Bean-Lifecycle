package com.ahmeterdogan.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class Config {
    @Bean
    @Order(-123123123)
    public Order5 order5() {
        return new Order5();
    }
}
