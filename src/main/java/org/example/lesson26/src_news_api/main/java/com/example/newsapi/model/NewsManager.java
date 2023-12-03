package com.example.newsapi.model;

import com.kwabenaberko.newsapilib.NewsApiClient;
import com.kwabenaberko.newsapilib.models.request.EverythingRequest;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;
import org.example.model.News;

import java.util.HashMap;
import java.util.Map;

public class NewsManager implements Model<News> {
    private final HashMap<Integer, News> newsHashMap = new HashMap<>();
    public NewsManager() {
        fetchNews();
    }

    private void fetchNews() {
        NewsApiClient newsApiClient = new NewsApiClient(System.getenv("API_NEWS_KEY"));
        newsApiClient.getEverything(
                new EverythingRequest.Builder()
                        .q("Ukraine")
                        .build(),
                new NewsApiClient.ArticlesResponseCallback() {
                    @Override
                    public void onSuccess(ArticleResponse response) {
                        for (int i = 0; i < response.getArticles().size(); i++) {
                            News news = new News("Glory to Ukraine:"+response.getArticles().get(i).getTitle(),
                                    response.getArticles().get(i).getAuthor(),
                                    response.getArticles().get(i).getDescription(),
                                    response.getArticles().get(i).getUrl());
                            newsHashMap.put(i, news);
                        }
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        System.out.println(throwable.getMessage());
                    }
                }
        );
    }

    @Override
    public News getById(int id) {
        return newsHashMap.get(id);
    }

    @Override
    public Map<Integer, News> getAll() {
        return newsHashMap;
    }
}

