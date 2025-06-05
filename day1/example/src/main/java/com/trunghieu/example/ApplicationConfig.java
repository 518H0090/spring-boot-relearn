package com.trunghieu.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean("custom_first_class")
    @Qualifier("first_bean")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("First bean");
    }

    @Bean
    @Qualifier("second_bean")
    public MyFirstClass mySecondClass() {
        return new MyFirstClass("Second bean");
    }

    @Bean
    @Qualifier("third_bean")
    @Primary
    public MyFirstClass myThirdClass() {
        return new MyFirstClass("Third bean");
    }
}
