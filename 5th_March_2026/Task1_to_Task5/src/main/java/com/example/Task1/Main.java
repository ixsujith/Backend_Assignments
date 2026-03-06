package com.example.Task1;


import com.example.Task1.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        springTest springtest = context.getBean(springTest.class);
        springtest.output();
    }
}