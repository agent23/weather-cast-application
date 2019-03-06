package com.weather.cast.weathercast.services;

import com.weather.cast.weathercast.configs.Configurations;
import com.weather.cast.weathercast.models.WeatherRequest;
import com.weather.cast.weathercast.models.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private Configurations configs;

    @Autowired
    public WeatherService(Configurations configs){
        this.configs = configs;
    }

    public WeatherResponse getWeatherCast(WeatherRequest weatherRequest){
        RestTemplate restTemplate = new RestTemplate();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(configs.getForecastHttpsUrl());
        stringBuilder.append(configs.getApiKey());
        stringBuilder.append("&q=");
        stringBuilder.append(weatherRequest.getQ());
        stringBuilder.append("&days=");
        stringBuilder.append(weatherRequest.getDays());
        stringBuilder.append("&lang=");
        stringBuilder.append(weatherRequest.getLang());
        stringBuilder.append("&hour=");
        stringBuilder.append(weatherRequest.getHour());


        return restTemplate.getForObject(stringBuilder.toString(), WeatherResponse.class);
    }
}
