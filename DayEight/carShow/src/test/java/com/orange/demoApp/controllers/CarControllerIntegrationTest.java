package com.orange.demoApp.controllers;


import com.orange.demoApp.dto.CarDto;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Data
public class CarControllerIntegrationTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void whenGetCarsThenReturnNotEmptyList() {
        var response = testRestTemplate.getForEntity("/cars", CarDto[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertNotNull(response.getBody());
        assertNotEquals(0, response.getBody().length);
    }

}
