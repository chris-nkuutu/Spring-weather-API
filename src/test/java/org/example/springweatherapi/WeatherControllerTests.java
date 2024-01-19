package org.example.springweatherapi;

import org.example.springweatherapi.controller.WeatherController;
import org.example.springweatherapi.model.Weather;
import org.example.springweatherapi.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WeatherController.class)
public class WeatherControllerTests {
        @MockBean
        private WeatherService service;

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void getEmployees_ShouldReturnListOfCitiesInCountry ()throws Exception{

            when(service.getCitiesInCountry()).thenReturn((getMockWeather()));

            mockMvc.perform(MockMvcRequestBuilders.get("/api/weather/"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", hasSize(5)))


            ;

        }
    public Iterable<Weather> getMockWeather() {
        Weather[] weatherArray = {
                new Weather("Uganda", "Kampala","24 degrees", "Rainy"),
                new Weather("Sweden", "Gothernburg","-15 degrees", "Snowing"),
                new Weather("China", "ShanPaei","24 degrees", "Rainy"),
                new Weather("Uganda", "Kampala","24 degrees", "Rainy"),
                new Weather("Uganda", "Kampala","24 degrees", "Rainy"),

        };

        return Arrays.stream(weatherArray).toList();
    }
}
