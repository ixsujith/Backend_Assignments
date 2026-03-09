package com.example.Task1to5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomMessage {

    @Value("${app.name}")
    private String message;

    @PostConstruct
    public void test() {
        System.out.println(message);
    }
}
