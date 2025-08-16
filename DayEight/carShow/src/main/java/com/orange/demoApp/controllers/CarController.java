package com.orange.demoApp.controllers;

import com.orange.demoApp.dto.CarDto;
import com.orange.demoApp.services.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<CarDto> getCarDtoList(@RequestParam(required = false) String modelName) {
        if(modelName != null) {
            return carService.getCarDtoListByModelName(modelName);
        }
        return carService.getCarDtoList();
    }

    @GetMapping("/cars/{modelId}")
    public CarDto getCarById(@PathVariable int modelId) {
        return carService.getCarById(modelId);
    }

    @GetMapping("/cars/mostExpensive")
    public CarDto getCarWithMaxPrice() {
        return carService.getCarWithMaxPrice();
    }

    @PostMapping("/cars")
    public CarDto addCarToCarDtoList(@RequestBody CarDto carDto) {
        return carService.addCarToCarDtoList(carDto);
    }

    @DeleteMapping("/cars/{modelId}")
    public void deleteCarFromCarDtoList(@PathVariable  int modelId) {
        carService.deleteCarFromCarDtoList(modelId);
    }

}
