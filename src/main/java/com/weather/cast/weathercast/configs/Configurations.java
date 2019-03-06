package com.weather.cast.weathercast.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "api")
public class Configurations {
    private String baseUrl;
    private String apiKey;
    private String currentHttpUrl;
    private String currentHttpsUrl;
    private String forecastHttpUrl;
    private String forecastHttpsUrl;
}
