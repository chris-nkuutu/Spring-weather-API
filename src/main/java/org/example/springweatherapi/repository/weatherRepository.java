package org.example.springweatherapi.repository;

import org.example.springweatherapi.model.Weather;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface weatherRepository {
    Iterable<Weather> findById(Serializable id);

    void save(Iterable<Weather> weatherList);
}
