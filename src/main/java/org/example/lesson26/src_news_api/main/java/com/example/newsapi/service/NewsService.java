package com.example.newsapi.service;

import com.example.newsapi.exception.NewsNotFoundException;
import com.example.newsapi.model.NewsManager;
import lombok.AllArgsConstructor;
import org.example.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class NewsService {
    @Autowired
    private NewsManager newsManager;

    public Map<Integer, News> getAllNews() {
        return newsManager.getAll();
    }

    public News getNewsById(int id) throws NewsNotFoundException {
        return newsManager.getById(id);
    }
}
