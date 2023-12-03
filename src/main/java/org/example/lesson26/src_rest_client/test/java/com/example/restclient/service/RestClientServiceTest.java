package com.example.restclient.service;

import org.example.model.News;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestClientServiceTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestClient restClient;

    @Test
    public void getAllNewsTest() {
        ResponseEntity<News> responseEntity = testRestTemplate.exchange(
                "http://localhost:" + port + "/news/getAllNews", HttpMethod.GET, null,
                News.class);

        assertThat(responseEntity.getBody()).isNotNull();
        Map<Integer, News> realResponse = restClient.getAllNews();
        assertThat(realResponse).isNotNull();
    }


    @Test
    public void getNewsByIdTest() {
        ResponseEntity<News> responseEntity = testRestTemplate.getForEntity(
                "http://localhost:" + port + "/news/getNewsById/1", News.class);

        assertThat(responseEntity.getBody()).isNotNull();
        News realResponse = restClient.getNewsById(1);
        assertThat(realResponse).isNotNull();
    }
}
