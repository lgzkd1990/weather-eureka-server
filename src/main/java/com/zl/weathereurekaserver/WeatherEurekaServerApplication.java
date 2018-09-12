package com.zl.weathereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WeatherEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherEurekaServerApplication.class, args);
    }
}
