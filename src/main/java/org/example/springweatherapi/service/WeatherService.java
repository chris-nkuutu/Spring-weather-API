package org.example.springweatherapi.service;

import jakarta.persistence.Id;
import org.example.springweatherapi.model.Weather;
import org.example.springweatherapi.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository repository;

    public Iterable<Weather> getCitiesInCountry(String country) {
        return repository.findByCountryName(country);
    }

    public Iterable<Weather> getWeatherByCityId(String city) {
        return repository.findByCityName(city);
    }
    public Weather createWeather(Weather weather){
        return repository.save(weather);
    }
    public boolean deleteWeatherById(Long id){
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
        return true;

    }

    public Iterable <Weather> seed() {
            Weather[] weathers = {

                    new Weather("Uganda", "kampala", "24°c", "Humid"),
                    new Weather("Sweden", "stockholm", "-11°c", "snowing"),
                    new Weather("Croatia", "palladium", "22°c", "raining")
            };

            var weatherList = Arrays.stream((weathers)).toList();


            return repository.saveAll(weatherList);

        }


    public Object getCitiesInCountry() {
        return getCitiesInCountry();
    }

    public Weather updateWeatherById(long id, Weather weather) {
        return weather;
    }
}



