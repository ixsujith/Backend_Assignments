package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    // Constructor Method
//    public BeanA(BeanB beanB) {
//        this.beanB = beanB;
//    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    private BeanB beanB;

    public void output1() {
        System.out.println("This is Bean A");
    }
}
