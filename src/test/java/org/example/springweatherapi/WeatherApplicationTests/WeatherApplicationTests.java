package org.example.springweatherapi.WeatherApplicationTests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:application-context.xml"})
@SpringBootTest
class WeatherApplicationTests {

    @Test
    void contextLoads() {
    }

}
