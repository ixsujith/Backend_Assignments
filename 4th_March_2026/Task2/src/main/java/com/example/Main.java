/*
Task 2 – Implement Custom Bean Lifecycle Logging
    Add:
        @PostConstruct
        @PreDestroy
        InitializingBean
        DisposableBean
    Print logs in each stage.
    Understand:
        Creation → Injection → Initialization → Destruction
*/

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.close();
    }
}