package com.weather.cast.weathercast.models;

import lombok.Data;

@Data
public class Day {
    private String maxtemp_c;
    private String maxtemp_f;
    private String mintemp_c;
    private String mintemp_f;
    private String avgtemp_c;
    private String avgtemp_f;
    private String maxwind_mph;
    private String maxwind_kph;
    private String totalprecip_mm;
    private String totalprecip_in;
    private String avgvis_km;
    private String avgvis_miles;
    private String avghumidity;
    private Condition condition;
    private String uv;
}
