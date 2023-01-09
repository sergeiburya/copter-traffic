package com.example.coptertraffic.dto.request;

import java.util.List;
import lombok.Data;

@Data
public class FlightRequestDto {
    private Long number;
    private List<Long> wayPointsId;
    private List<Long> passedPointsId;
}
