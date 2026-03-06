package com.example.Task2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetComponent {

    @Autowired
    public GreetComponent(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;

    public void greet() {
        System.out.println("Greet Component");
        greetingService.greet1();
    }



}
