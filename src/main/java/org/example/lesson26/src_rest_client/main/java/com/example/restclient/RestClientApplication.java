package com.example.restclient;

import com.example.restclient.service.RestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestClientApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RestClientApplication.class, args);
        RestClient bean = run.getBean(RestClient.class);
        System.out.println(bean.getAllNews());
    }
}
