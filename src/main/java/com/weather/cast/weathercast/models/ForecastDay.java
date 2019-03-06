package com.weather.cast.weathercast.models;

import lombok.Data;

@Data
public class ForecastDay {

    private String date;
    private String date_epoch;
    private Day day;
    private Astro astro;
}