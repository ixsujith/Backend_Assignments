package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
    }

    private BeanB beanB;

    public void output1() {
        System.out.println("This is Bean A");
    }
}
