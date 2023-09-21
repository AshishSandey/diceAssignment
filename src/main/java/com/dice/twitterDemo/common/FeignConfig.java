package com.dice.twitterDemo.common;

import feign.Logger;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Value("${feign.retry.interval}")
    private int retryInterval;

    @Value("${feign.retry.maxInterval}")
    private int retryMaxInterval;

    @Value("${feign.retry.maxAttempts}")
    private int retryMaxAttempts;

    @Bean
    public Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(retryInterval, retryMaxInterval, retryMaxAttempts);
    }

}

