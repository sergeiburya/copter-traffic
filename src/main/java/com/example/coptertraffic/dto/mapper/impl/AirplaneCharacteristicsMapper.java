package com.example.coptertraffic.dto.mapper.impl;

import com.example.coptertraffic.dto.mapper.RequestDtoMapper;
import com.example.coptertraffic.dto.mapper.ResponseDtoMapper;
import com.example.coptertraffic.dto.request.AirplaneCharacteristicsRequestDto;
import com.example.coptertraffic.dto.response.AirplaneCharacteristicsResponseDto;
import com.example.coptertraffic.model.AirplaneCharacteristics;
import org.springframework.stereotype.Component;

@Component
public class AirplaneCharacteristicsMapper
        implements RequestDtoMapper<AirplaneCharacteristicsRequestDto, AirplaneCharacteristics>,
        ResponseDtoMapper<AirplaneCharacteristicsResponseDto, AirplaneCharacteristics> {
    @Override
    public AirplaneCharacteristics mapToModel(AirplaneCharacteristicsRequestDto dto) {
        AirplaneCharacteristics airplaneCharacteristics = new AirplaneCharacteristics();
        airplaneCharacteristics.setAcceleration(dto.getAcceleration());
        airplaneCharacteristics.setMaxSpeed(dto.getMaxSpeed());
        airplaneCharacteristics.setSpeedOfChangeCourse(dto.getSpeedOfChangeCourse());
        airplaneCharacteristics.setSpeedOfChangeAltitude(dto.getSpeedOfChangeAltitude());
        return airplaneCharacteristics;
    }

    @Override
    public AirplaneCharacteristicsResponseDto mapToDto(
            AirplaneCharacteristics airplaneCharacteristics) {
        AirplaneCharacteristicsResponseDto responseDto = new AirplaneCharacteristicsResponseDto();
        responseDto.setId(airplaneCharacteristics.getId());
        responseDto.setAcceleration(airplaneCharacteristics.getAcceleration());
        responseDto.setMaxSpeed(airplaneCharacteristics.getMaxSpeed());
        responseDto.setSpeedOfChangeAltitude(airplaneCharacteristics.getSpeedOfChangeAltitude());
        responseDto.setSpeedOfChangeCourse(airplaneCharacteristics.getSpeedOfChangeCourse());
        return responseDto;
    }
}
