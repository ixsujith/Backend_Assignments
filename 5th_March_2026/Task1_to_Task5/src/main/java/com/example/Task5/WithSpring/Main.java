package com.example.Task5.WithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Class1 class1 = context.getBean(Class1.class);

        class1.MainOutput();
    }
}
