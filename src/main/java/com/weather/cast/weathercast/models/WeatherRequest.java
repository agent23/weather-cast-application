package com.weather.cast.weathercast.models;

import lombok.Data;

@Data
public class WeatherRequest {
    private String q;               //required  (city name, zipcode,ip address e.g.: q=Paris, q=)
    private String days;            //required for forecast   (days=5)
    private String dt;              /*(Required for History API)
                                        For history API 'dt' should be on or after 1st Jan, 2015 in yyyy-MM-dd format
                                        For forecast should be between today and next 10 day in yyyy-MM-dd format*/
    private String unixdt;          //(Optional unixdt=1490227200) use either dt or unixdt not both
    private String end_dt;          //(Optional)  (Available for History API)
    private String unixend_dt;      //(Optional)
    private String hour;            //(Optional) hour=5
    private String lang;            //(Optional) lang=zu
}
