package com.ahmeterdogan.eventandnotifications.close;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CloseConfig {

    @Bean
    public LocalDateTime nowBean() {
        return LocalDateTime.now();
    }
}
