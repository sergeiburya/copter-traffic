package com.example.coptertraffic.dto.mapper.impl;

import com.example.coptertraffic.dto.mapper.RequestDtoMapper;
import com.example.coptertraffic.dto.mapper.ResponseDtoMapper;
import com.example.coptertraffic.dto.request.WayPointRequestDto;
import com.example.coptertraffic.dto.response.WayPointResponseDto;
import com.example.coptertraffic.model.WayPoint;
import org.springframework.stereotype.Component;

@Component
public class WayPointMapperImpl implements RequestDtoMapper<WayPointRequestDto, WayPoint>,
        ResponseDtoMapper<WayPointResponseDto, WayPoint> {
    @Override
    public WayPoint mapToModel(WayPointRequestDto dto) {
        WayPoint wayPoint = new WayPoint();
        wayPoint.setLatitude(dto.getLatitude());
        wayPoint.setLongitude(dto.getLongitude());
        wayPoint.setSpanHeight(dto.getSpanHeight());
        wayPoint.setOverflightSpeed(dto.getOverflightSpeed());
        return wayPoint;
    }

    @Override
    public WayPointResponseDto mapToDto(WayPoint wayPoint) {
        WayPointResponseDto wayPointResponseDto = new WayPointResponseDto();
        wayPointResponseDto.setId(wayPoint.getId());
        wayPointResponseDto.setLatitude(wayPoint.getLatitude());
        wayPointResponseDto.setLongitude(wayPoint.getLongitude());
        wayPointResponseDto.setSpanHeight(wayPointResponseDto.getSpanHeight());
        wayPointResponseDto.setOverflightSpeed(wayPoint.getOverflightSpeed());
        return wayPointResponseDto;
    }
}
