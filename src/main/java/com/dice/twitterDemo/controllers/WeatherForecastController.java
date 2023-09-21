package com.dice.twitterDemo.controllers;

import com.dice.twitterDemo.services.interfaces.WeatherForecastService;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weather")
public class WeatherForecastController {

    @Autowired
    private WeatherForecastService weatherForecastService;

    @GetMapping(value = "/forecast/{locationName}/hourly")
    JsonNode getHourlyForecastByLocationName(@PathVariable("locationName") String locationName){
        return weatherForecastService.getHourlyForecastByLocationName(locationName);
    }

    @GetMapping(value = "/forecast/{locationName}/summary")
    JsonNode getForecastSummaryByLocationName(@PathVariable("locationName") String locationName){
        return weatherForecastService.getForecastSummaryByLocationName(locationName);
    }
}
