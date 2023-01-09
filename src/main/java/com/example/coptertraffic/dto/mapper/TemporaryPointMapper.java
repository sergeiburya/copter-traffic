package com.example.coptertraffic.dto.mapper;

import com.example.coptertraffic.dto.request.TemporaryPointRequestDto;
import com.example.coptertraffic.dto.response.TemporaryPointResponseDto;
import com.example.coptertraffic.model.TemporaryPoint;
import org.springframework.stereotype.Component;

@Component
public class TemporaryPointMapper {
    public TemporaryPointResponseDto toResponseDto(TemporaryPoint temporaryPoint) {
        TemporaryPointResponseDto responseDto = new TemporaryPointResponseDto();
        responseDto.setId(temporaryPoint.getId());
        responseDto.setLatitude(temporaryPoint.getLatitude());
        responseDto.setLongitude(temporaryPoint.getLongitude());
        responseDto.setSpanHeight(temporaryPoint.getSpanHeight());
        responseDto.setOverflightSpeed(temporaryPoint.getOverflightSpeed());
        responseDto.setFlightDirection(temporaryPoint.getFlightDirection());
        return responseDto;
    }

    public TemporaryPoint toModel(TemporaryPointRequestDto requestDto) {
        TemporaryPoint temporaryPoint = new TemporaryPoint();
        temporaryPoint.setLatitude(requestDto.getLatitude());
        temporaryPoint.setLongitude(requestDto.getLongitude());
        temporaryPoint.setSpanHeight(requestDto.getSpanHeight());
        temporaryPoint.setOverflightSpeed(requestDto.getOverflightSpeed());
        temporaryPoint.setFlightDirection(requestDto.getFlightDirection());
        return temporaryPoint;
    }
}
