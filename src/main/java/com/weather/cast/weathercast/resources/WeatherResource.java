package com.weather.cast.weathercast.resources;

import com.weather.cast.weathercast.models.WeatherRequest;
import com.weather.cast.weathercast.models.WeatherResponse;
import com.weather.cast.weathercast.services.WeatherService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class WeatherResource {
    private WeatherService weatherService;

    @Autowired
    public WeatherResource(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @PostMapping("/forecast")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<WeatherResponse> getWeatherCast(@RequestBody WeatherRequest weatherRequest){
        if (StringUtils.isBlank(weatherRequest.getQ())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(weatherService.getWeatherCast(weatherRequest));
    }
}
