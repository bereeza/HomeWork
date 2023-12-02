package com.example.newsapi.controller;

import com.example.newsapi.exception.NewsNotFoundException;
import com.example.newsapi.service.NewsService;
import lombok.AllArgsConstructor;
import org.example.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/getAllNews")
    public Map<Integer, News> getNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/getNewsById/{id}")
    public News getNewsById(@PathVariable int id) throws NewsNotFoundException {
        return newsService.getNewsById(id);
    }
}
