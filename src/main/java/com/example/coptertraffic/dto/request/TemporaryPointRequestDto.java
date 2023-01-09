package com.example.coptertraffic.dto.request;

import lombok.Data;

@Data
public class TemporaryPointRequestDto {
    private double latitude;
    private double longitude;
    private double spanHeight;
    private double overflightSpeed;
    private double flightDirection;
}
