package com.example.sprinweb.config;

import com.example.sprinweb.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public OrderService orderService(){
        return new OrderService();
    }
}
