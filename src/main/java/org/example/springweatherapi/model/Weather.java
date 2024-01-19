package org.example.springweatherapi.model;

import java.util.Objects;
public class Weather {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(country, weather.country) && Objects.equals(city, weather.city) && Objects.equals(temperature, weather.temperature) && Objects.equals(condition, weather.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, temperature, condition);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
