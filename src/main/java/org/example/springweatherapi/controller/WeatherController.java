package org.example.springweatherapi.controller;

import org.example.springweatherapi.model.Weather;
import org.example.springweatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(path="/weather")
    public class WeatherController {

        @Autowired
        private final WeatherService weatherService;

        public WeatherController(WeatherService weatherService) {
            this.weatherService = weatherService;
        }

        @GetMapping("/country/cities")
        public Iterable<Weather> getCitiesInCountry(@PathVariable String country) {
            return weatherService.getCitiesInCountry(country);
        }

        @GetMapping("/weather/{city}")
        public Iterable<Weather> getWeatherByCityId(@PathVariable String city) {
            return weatherService.getWeatherByCityId(city);
        }
        @PostMapping("/seed")
        public boolean postSeedWeather(){
            return weatherService.seed();
        }
    }
