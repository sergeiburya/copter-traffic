package com.example.coptertraffic.controller;

import com.example.coptertraffic.dto.mapper.impl.FlightMapperImpl;
import com.example.coptertraffic.dto.request.FlightRequestDto;
import com.example.coptertraffic.dto.response.FlightResponseDto;
import com.example.coptertraffic.model.Flight;
import com.example.coptertraffic.service.FlightService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;
    private final FlightMapperImpl flightMapper;

    public FlightController(FlightService flightService, FlightMapperImpl flightMapper) {
        this.flightService = flightService;
        this.flightMapper = flightMapper;
    }

    @GetMapping("/find-all")
    public List<FlightResponseDto> findAll() {
        return flightService.findAll()
                .stream()
                .map(flightMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/add-flight")
    public FlightResponseDto save(@RequestBody FlightRequestDto requestDto) {
        Flight flight = flightService.save(flightMapper.mapToModel(requestDto));
        return flightMapper.mapToDto(flight);
    }

    @GetMapping("/{id}")
    public FlightResponseDto getById(@PathVariable Long id) {
        Flight flightById = flightService.getById(id);
        return flightMapper.mapToDto(flightById);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id) {
        flightService.deleteById(id);
    }

    @PostMapping("{id}")
    public FlightResponseDto update(@PathVariable Long id,
                                    @RequestBody FlightRequestDto requestDto) {
        Flight flight = flightMapper.mapToModel(requestDto);
        flight.setId(id);
        return flightMapper.mapToDto(flightService.save(flight));
    }
}
