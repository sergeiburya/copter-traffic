package com.example.coptertraffic.dto.response;

import java.util.List;
import lombok.Data;

@Data
public class FlightResponseDto {
    private Long id;
    private Long number;
    private List<Long> wayPointsId;
    private List<Long> passedPointsId;

}
