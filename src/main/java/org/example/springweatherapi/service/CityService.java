package org.example.springweatherapi.service;

import org.example.springweatherapi.model.City;
import org.example.springweatherapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Iterable<City> getCitiesByCountry(String country) {
        return cityRepository.findByCountry(country);
    }
}
