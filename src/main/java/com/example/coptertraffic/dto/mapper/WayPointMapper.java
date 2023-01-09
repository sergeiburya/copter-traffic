package com.example.coptertraffic.dto.mapper;

import com.example.coptertraffic.dto.request.WayPointRequestDto;
import com.example.coptertraffic.dto.response.WayPointResponseDto;
import com.example.coptertraffic.model.WayPoint;
import org.springframework.stereotype.Component;

@Component
public class WayPointMapper {
    public WayPointResponseDto toResponseDto(WayPoint wayPoint) {
        WayPointResponseDto wayPointResponseDto = new WayPointResponseDto();
        wayPointResponseDto.setId(wayPoint.getId());
        wayPointResponseDto.setLatitude(wayPoint.getLatitude());
        wayPointResponseDto.setLongitude(wayPoint.getLongitude());
        wayPointResponseDto.setSpanHeight(wayPointResponseDto.getSpanHeight());
        wayPointResponseDto.setOverflightSpeed(wayPoint.getOverflightSpeed());
        return wayPointResponseDto;
    }

    public WayPoint toModel(WayPointRequestDto wayPointResponseDto) {
        WayPoint wayPoint = new WayPoint();
        wayPoint.setLatitude(wayPointResponseDto.getLatitude());
        wayPoint.setLongitude(wayPointResponseDto.getLongitude());
        wayPoint.setSpanHeight(wayPointResponseDto.getSpanHeight());
        wayPoint.setOverflightSpeed(wayPointResponseDto.getOverflightSpeed());
        return wayPoint;
    }
}
