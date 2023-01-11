package com.example.coptertraffic.dto.mapper.impl;

import com.example.coptertraffic.dto.mapper.RequestDtoMapper;
import com.example.coptertraffic.dto.mapper.ResponseDtoMapper;
import com.example.coptertraffic.dto.request.FlightRequestDto;
import com.example.coptertraffic.dto.response.FlightResponseDto;
import com.example.coptertraffic.model.Flight;
import com.example.coptertraffic.model.TemporaryPoint;
import com.example.coptertraffic.model.WayPoint;
import com.example.coptertraffic.repository.WayPointRepository;
import com.example.coptertraffic.service.TemporaryPointService;
import com.example.coptertraffic.service.WayPointService;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class FlightMapperImpl implements RequestDtoMapper<FlightRequestDto, Flight>,
        ResponseDtoMapper<FlightResponseDto, Flight> {
    private final WayPointService wayPointService;
    private final TemporaryPointService temporaryPointService;

    public FlightMapperImpl(WayPointService wayPointService,
                            TemporaryPointService temporaryPointService,
                            WayPointRepository wayPointRepository) {
        this.wayPointService = wayPointService;
        this.temporaryPointService = temporaryPointService;
    }

    @Override
    public Flight mapToModel(FlightRequestDto dto) {
        Flight flight = new Flight();
        flight.setNumber(dto.getNumber());
        flight.setWayPoints(wayPointService.findAll());//TODO
        flight.setPassedPoints(temporaryPointService.findAll());//TODO
        return flight;
    }

    @Override
    public FlightResponseDto mapToDto(Flight flight) {
        FlightResponseDto responseDto = new FlightResponseDto();
        responseDto.setId(flight.getId());
        responseDto.setNumber(flight.getNumber());
        responseDto.setWayPointsId(flight.getWayPoints()
                .stream()
                .map(WayPoint::getId)
                .collect(Collectors.toList()));
        responseDto.setPassedPointsId(flight.getPassedPoints()
                .stream()
                .map(TemporaryPoint::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
