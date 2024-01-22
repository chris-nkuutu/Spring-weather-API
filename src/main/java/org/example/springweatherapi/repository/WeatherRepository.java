package org.example.springweatherapi.repository;

import org.example.springweatherapi.model.Weather;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface WeatherRepository extends CrudRepository<Weather,Long> {
    Iterable<Weather> findById(Serializable id);

    public void save(Iterable<Weather> weatherList);

    Iterable<Weather> findByCountryName(String country);

    Iterable<Weather> findByCityName(String city);
}
