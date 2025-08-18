package com.orange.demoApp.services;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orange.demoApp.dto.CarDto;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class CarServiceUnitTest {
 @Mock
    ObjectMapper objectMapper;
    @InjectMocks
    CarService carService;

    @Test
    @SneakyThrows
    void when_GetCars_ThenSuccess() {
        //when

//        when(objectMapper.readValue(anyString(), ArgumentMatchers.<TypeReference<List<CarDto>>>any()))
//                .thenReturn(List.of());
        // has no use since we populate the list based on init function
        carService.carDtoListInit();
        var response = carService.getCarDtoList();
        //then
        assertNotEquals(0, response.size());
    }
}
