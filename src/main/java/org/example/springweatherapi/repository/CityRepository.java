package org.example.springweatherapi.repository;

import org.example.springweatherapi.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository <City,Long>{
    Iterable<City> findByCountry(String country);
}
