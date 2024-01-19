package org.example.springweatherapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long id;
    private String country;
    private String city;
    private String temperature;
    private String condition;

    public Weather(String country, String city, String temperature, String condition) {
        this.country = country;
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    public Weather() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
