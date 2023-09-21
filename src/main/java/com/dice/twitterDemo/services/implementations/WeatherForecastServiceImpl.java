package com.dice.twitterDemo.services.implementations;

import com.dice.twitterDemo.services.clients.RapidApiClient;
import com.dice.twitterDemo.services.interfaces.WeatherForecastService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {

    @Autowired
    private RapidApiClient rapidApiClient;

    @Override
    public JsonNode getForecastSummaryByLocationName(String locationName) {
        return rapidApiClient.getRapidApiGetForecastSummaryByLocationName(locationName);
    }

    @Override
    public JsonNode getHourlyForecastByLocationName(String locationName) {
        return rapidApiClient.getRapidApiGetHourlyForecastByLocationName(locationName);
    }
}
