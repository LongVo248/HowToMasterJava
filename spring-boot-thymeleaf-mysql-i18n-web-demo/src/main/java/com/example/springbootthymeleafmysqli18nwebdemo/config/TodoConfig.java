package com.example.springbootthymeleafmysqli18nwebdemo.config;

import com.example.springbootthymeleafmysqli18nwebdemo.model.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {

    @Bean
    public TodoValidator validator() {
        return new TodoValidator();
    }
}
