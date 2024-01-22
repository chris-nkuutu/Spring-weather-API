package org.example.springweatherapi.controller;

import org.example.springweatherapi.model.Weather;
import org.example.springweatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping(path="/api/weather")
    public class WeatherController {

        @Autowired
        private final WeatherService service;

        public WeatherController(WeatherService service) {
            this.service = service;
        }
        @GetMapping
        public Iterable<Weather> getAllWeather(){
            return service.getWeatherList();
        }

        @GetMapping(path = "/{country_name}/cities")
        public Iterable<Weather> getCitiesInCountry(@PathVariable String country_name) {
            return service.getCitiesInCountry(country_name);
        }

        @GetMapping("/weather/{cityId}")
        public Iterable<Weather> getWeatherByCityId(@PathVariable Long cityId) {
            return service.getWeatherByCityId(String.valueOf(cityId));
        }
        @PostMapping()
        public Weather postWeather(@RequestBody Weather weather) {
        return service.createWeather(weather);

        }
        @PutMapping("/{id}")
        public Weather putWeather(@PathVariable long id,@RequestBody Weather weather){
         return service.updateWeatherById(id,weather);
    }
        @PostMapping("/seed")
        public Iterable postSeedWeather(){
            return service.seed();
        }
    }
