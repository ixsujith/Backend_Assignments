package com.example.Task5.WithSpring;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Class1 {
    public Class1(Class2 class2) {
        this.class2 = class2;
    }

    private Class2 class2;

    public void MainOutput() {
        System.out.print("Accessing from class1: ");
        class2.output1();
    }
}
