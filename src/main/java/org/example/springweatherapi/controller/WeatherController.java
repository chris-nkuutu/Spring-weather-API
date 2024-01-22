package org.example.springweatherapi.controller;

import org.example.springweatherapi.model.Weather;
import org.example.springweatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping(path="/api")
    public class WeatherController {

        @Autowired
        private final WeatherService service;

        public WeatherController(WeatherService service) {
            this.service = service;
        }

        @GetMapping("/{country}/cities")
        public Iterable<Weather> getCitiesInCountry(@PathVariable String country) {
            return service.getCitiesInCountry(country);
        }

        @GetMapping("/weather/{city}")
        public Iterable<Weather> getWeatherByCityId(@PathVariable String city) {
            return service.getWeatherByCityId(city);
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
