package org.example.springweatherapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long id;
    private String country;
    private String city;
    private String temperature_degree;
    private String condition_weather;

    public Weather(String country_name, String city, String temperature_degree, String condition_weather) {
        this.country = country_name;
        this.city = city;
        this.temperature_degree = temperature_degree;
        this.condition_weather = condition_weather;
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

    public String getTemperature_degree() {
        return temperature_degree;
    }

    public void setTemperature_degree(String temperature) {
        this.temperature_degree = temperature;
    }

    public String getCondition_weather() {
        return condition_weather;
    }

    public void setCondition_weather(String condition) {
        this.condition_weather = condition;
    }
}
