package com.example.coptertraffic.dto.request;

import lombok.Data;

@Data
public class AirplaneCharacteristicsRequestDto {
    private double maxSpeed;
    private double acceleration;
    private double speedOfChangeAltitude;
    private double speedOfChangeCourse;
}
