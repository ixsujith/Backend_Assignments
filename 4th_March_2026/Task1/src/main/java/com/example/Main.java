/*
Task 1 – Build Spring WITHOUT Boot
    Create Maven project manually.
    Add:
        spring-context
        spring-beans
    No Boot.
 
    Create:
        UserRepository
        UserService
        AppConfig (Java config)
*/

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        userService.output1();
        userService.output2();
    }
}