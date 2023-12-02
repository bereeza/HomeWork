package com.example.restclient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

    public static final String NEWS_HOST = "http://localhost:8080/news/";

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
