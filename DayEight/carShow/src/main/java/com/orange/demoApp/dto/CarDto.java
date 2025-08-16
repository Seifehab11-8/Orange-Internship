package com.orange.demoApp.dto;

import lombok.Data;

@Data
public class CarDto {
    private String thumbnail;
    private int makeId;
    private int modelId;
    private MakeData make;
    private ModelData model;
    private int year;
    private int price;
    private int carStatus;
}
