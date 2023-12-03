package com.example.newsapi.configuration;

import com.example.newsapi.model.NewsManager;
import com.example.newsapi.service.NewsService;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public NewsManager newsManager() {
        return new NewsManager();
    }

    @Bean
    public NewsService newsService(NewsManager newsManager) {
        return new NewsService(newsManager);
    }
}
