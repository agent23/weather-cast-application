package com.weather.cast.weathercast.models;

import lombok.Data;

@Data
public class Condition {
    private String text;
    private String icon;
    private String code;
}
