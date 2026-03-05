package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    public BeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    private BeanB beanB;

    public void BeanB() {
        System.out.println("This is Bean B");
    }
}
