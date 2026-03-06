package com.example.Task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SpringTest springTest() {
        return new SpringTest();
    }
}
