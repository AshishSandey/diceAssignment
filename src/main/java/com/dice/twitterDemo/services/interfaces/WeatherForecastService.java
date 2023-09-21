package com.dice.twitterDemo.services.interfaces;

import com.dice.twitterDemo.services.clients.RapidApiClient;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface WeatherForecastService {

    JsonNode getForecastSummaryByLocationName(String locationName);
    JsonNode getHourlyForecastByLocationName(String locationName);


}
