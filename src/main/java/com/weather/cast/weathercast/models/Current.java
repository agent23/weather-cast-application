package com.weather.cast.weathercast.models;

import lombok.Data;

@Data
public class Current {
    private String last_updated_epoch;
    private String last_updated;
    private String temp_c;
    private String temp_f;
    private String is_day;
    private Condition condition;
    private String wind_mph;
    private String wind_kph;
    private String wind_degree;
    private String wind_dir;
    private String pressure_mb;
    private String pressure_in;
    private String precip_mm;
    private String precip_in;
    private String humidity;
    private String cloud;
    private String feelslike_c;
    private String feelslike_f;
    private String vis_km;
    private String vis_miles;
    private String uv;
}
