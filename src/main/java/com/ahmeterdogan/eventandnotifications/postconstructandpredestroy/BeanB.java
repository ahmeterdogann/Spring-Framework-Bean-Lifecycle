package com.ahmeterdogan.eventandnotifications.postconstructandpredestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class BeanB {
    private LocalDateTime timeAtInject;
    private LocalDateTime timeAtPostConstruct;

    public BeanB(LocalDateTime now) {
        System.out.println("BeanB()");
        this.timeAtInject = now;
    }

    @PostConstruct
    public void init() {
        timeAtPostConstruct = LocalDateTime.now();
        System.out.println("BeanB init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BeanB destroy()");
    }

    public LocalDateTime getTimeAtInject() {
        return timeAtInject;
    }

    public LocalDateTime getTimeAtPostConstruct() {
        return timeAtPostConstruct;
    }
}
