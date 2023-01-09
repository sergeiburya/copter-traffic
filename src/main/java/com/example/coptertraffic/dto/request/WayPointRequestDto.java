package com.example.coptertraffic.dto.request;

import lombok.Data;

@Data
public class WayPointRequestDto {
    private double latitude;
    private double longitude;
    private double spanHeight;
    private double overflightSpeed;
}
