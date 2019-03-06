package com.weather.cast.weathercast.models;

import lombok.Data;

@Data
public class WeatherResponse {
    private Location location;
    private Current current;
    private Forecast forecast;
}
