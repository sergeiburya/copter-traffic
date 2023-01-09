package com.example.coptertraffic.dto.response;

import lombok.Data;

@Data
public class TemporaryPointResponseDto {
    private Long id;
    private double latitude;
    private double longitude;
    private double spanHeight;
    private double overflightSpeed;
    private double flightDirection;
}
