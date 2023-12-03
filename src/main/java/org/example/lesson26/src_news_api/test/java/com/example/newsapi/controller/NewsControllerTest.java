package com.example.newsapi.controller;

import com.example.newsapi.service.NewsService;
import org.example.model.News;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NewsControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private NewsService newsService;

    @Test
    public void getAllNewsTest() {
        Map<Integer, News> newsMap = new HashMap<>();
        newsMap.put(1, new News("test 1", "author 1", "youtube", "https://www.youtube.com/"));
        newsMap.put(2, new News("test 2", "author 2", "github", "https://github.com/"));
        when(newsService.getAllNews()).thenReturn(newsMap);
        ResponseEntity<Map<Integer, News>> responseEntity = testRestTemplate.exchange(
                "http://localhost:" + port + "/news/getAllNews",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        assertThat(responseEntity.getBody()).isEqualTo(newsMap);
    }

    @Test
    public void getNewsByIdTest() {
        int id = 1;
        News news = new News("test 2", "author 2", "github", "https://github.com/");
        when(newsService.getNewsById(id)).thenReturn(news);
        ResponseEntity<News> responseEntity = testRestTemplate.getForEntity("http://localhost:" + port + "/news/getNewsById/" + id, News.class);
        assertThat(responseEntity.getBody()).isEqualTo(news);
    }
}