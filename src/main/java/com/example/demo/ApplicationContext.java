package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {


    @Bean
    public MyFirstClass mySecondClass()
    {
        System.out.println("Second bean created");
        return new MyFirstClass("Second bean");
    }

    @Bean
    public MyFirstClass myFirstClass()
    {
        System.out.println("First bean created");
        return new MyFirstClass("First bean");
    }
}
