package com.dice.twitterDemo.interceptors;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RapidApiRequestInterceptor implements RequestInterceptor {

    @Value("${rapid-api.X-RapidAPI-Key}")
    private String rapidApiKey;

    @Value("${rapid-api.X-RapidAPI-Host}")
    private String rapidApiHost;

    @Override
    public void apply(RequestTemplate template) {
        template.header("X-RapidAPI-Key", rapidApiKey);
        template.header("X-RapidAPI-Host", rapidApiHost);
    }
}
