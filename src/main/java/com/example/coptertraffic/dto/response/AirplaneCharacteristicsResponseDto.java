package com.example.coptertraffic.dto.response;

import lombok.Data;

@Data
public class AirplaneCharacteristicsResponseDto {
    private Long id;
    private double maxSpeed;
    private double acceleration;
    private double speedOfChangeAltitude;
    private double speedOfChangeCourse;
}
