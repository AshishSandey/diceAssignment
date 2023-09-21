package com.dice.twitterDemo.services.clients;

import com.dice.twitterDemo.common.FeignConfig;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "rapidApi", url = "${rapid-api.baseUrl}", path = "/rapidapi", configuration = FeignConfig.class)
public interface RapidApiClient {

    @GetMapping(value = "/forecast/{locationName}/hourly/")
    JsonNode getRapidApiGetHourlyForecastByLocationName(@PathVariable("locationName") String locationName);

    @GetMapping(value = "/forecast/{locationName}/summary/")
    JsonNode getRapidApiGetForecastSummaryByLocationName(@PathVariable("locationName") String locationName);
}
