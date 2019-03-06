package com.weather.cast.weathercast.models;

import lombok.Data;

import java.util.List;

@Data
public class Forecast {

    private List<ForecastDay> forecastday;
}