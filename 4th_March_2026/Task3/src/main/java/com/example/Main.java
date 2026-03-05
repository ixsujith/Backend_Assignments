/*
Task 3 – Circular Dependency
    Create:
        A → depends on B
        B → depends on A
    Use constructor injection.
    Observe failure.
    Now change to setter injection.
    Understand WHY it works.
*/

package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BeanA beanA = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);
        beanA.output1();
        beanB.output2();
    }
}