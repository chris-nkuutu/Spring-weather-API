package org.example.springweatherapi.service;

import org.example.springweatherapi.model.Weather;
import org.example.springweatherapi.repository.weatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {
    
    private weatherRepository repository;
    public Iterable<Weather> getCitiesInCountry(String country) {
        return repository.findById(country);
    }

    public Iterable<Weather> getWeatherByCityId(String city) {
        return repository.findById(city);
    }

    public boolean seed() {
            try {
                Weather[] weathers = {

                        new Weather("Uganda","kampala","24°c","Humid"),
                        new Weather("Sweden","stockholm","-11°c","snowing"),
                        new Weather("Croatia","palladium","22°c","raining")
                };

                var weatherList = Arrays.stream((weathers)).toList();

               repository.save(weatherList);

                return true;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

    }


