package com.example.coptertraffic.dto.mapper.impl;

import com.example.coptertraffic.dto.mapper.RequestDtoMapper;
import com.example.coptertraffic.dto.mapper.ResponseDtoMapper;
import com.example.coptertraffic.dto.request.TemporaryPointRequestDto;
import com.example.coptertraffic.dto.response.TemporaryPointResponseDto;
import com.example.coptertraffic.model.TemporaryPoint;
import org.springframework.stereotype.Component;

@Component
public class TemporaryPointMapperImpl
        implements RequestDtoMapper<TemporaryPointRequestDto, TemporaryPoint>,
        ResponseDtoMapper<TemporaryPointResponseDto, TemporaryPoint> {
    @Override
    public TemporaryPoint mapToModel(TemporaryPointRequestDto dto) {
        TemporaryPoint temporaryPoint = new TemporaryPoint();
        temporaryPoint.setLatitude(dto.getLatitude());
        temporaryPoint.setLongitude(dto.getLongitude());
        temporaryPoint.setSpanHeight(dto.getSpanHeight());
        temporaryPoint.setOverflightSpeed(dto.getOverflightSpeed());
        temporaryPoint.setFlightDirection(dto.getFlightDirection());
        return temporaryPoint;
    }

    @Override
    public TemporaryPointResponseDto mapToDto(TemporaryPoint temporaryPoint) {
        TemporaryPointResponseDto responseDto = new TemporaryPointResponseDto();
        responseDto.setId(temporaryPoint.getId());
        responseDto.setLatitude(temporaryPoint.getLatitude());
        responseDto.setLongitude(temporaryPoint.getLongitude());
        responseDto.setSpanHeight(temporaryPoint.getSpanHeight());
        responseDto.setOverflightSpeed(temporaryPoint.getOverflightSpeed());
        responseDto.setFlightDirection(temporaryPoint.getFlightDirection());
        return responseDto;
    }
}
