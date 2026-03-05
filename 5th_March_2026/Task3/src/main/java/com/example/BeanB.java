package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

// Constructor Method
//    public BeanB(BeanA beanA) {
//        this.beanA = beanA;
//    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    private BeanA beanA;

    public void output2() {
        System.out.println("This is Bean B");
    }
}
