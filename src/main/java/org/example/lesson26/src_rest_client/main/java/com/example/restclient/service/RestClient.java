package com.example.restclient.service;

import com.example.restclient.configuration.Configuration;
import org.example.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class RestClient {
    @Autowired
    private RestTemplate restTemplate;

    public Map<Integer, News> getAllNews() {
        ParameterizedTypeReference<Map<Integer, News>> responseType = new ParameterizedTypeReference<>() {
        };

        RequestEntity<Void> requestEntity = RequestEntity.get(Configuration.NEWS_HOST + "getAllNews").accept(MediaType.APPLICATION_JSON).build();

        ResponseEntity<Map<Integer, News>> responseEntity = restTemplate.exchange(requestEntity, responseType);

        return responseEntity.getBody();
    }

    public News getNewsById(int id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<News> responseEntity = restTemplate.exchange(String.format(Configuration.NEWS_HOST + "getNewsById/%s", id), HttpMethod.GET, httpEntity, News.class);
        return responseEntity.getBody();
    }
}
