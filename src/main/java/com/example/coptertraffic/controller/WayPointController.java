package com.example.coptertraffic.controller;

import com.example.coptertraffic.dto.mapper.impl.WayPointMapperImpl;
import com.example.coptertraffic.dto.request.WayPointRequestDto;
import com.example.coptertraffic.dto.response.WayPointResponseDto;
import com.example.coptertraffic.model.WayPoint;
import com.example.coptertraffic.service.WayPointService;
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
@RequestMapping("/way-point")
public class WayPointController {
    private final WayPointService wayPointService;
    private final WayPointMapperImpl wayPointMapperImpl;

    public WayPointController(WayPointService wayPointService,
                              WayPointMapperImpl wayPointMapperImpl) {
        this.wayPointService = wayPointService;
        this.wayPointMapperImpl = wayPointMapperImpl;
    }

    @PostMapping("/add-way-point")
    public WayPointResponseDto save(@RequestBody WayPointRequestDto requestDto) {
        WayPoint wayPoint = wayPointService.save(wayPointMapperImpl.mapToModel(requestDto));
        return wayPointMapperImpl.mapToDto(wayPoint);
    }

    @GetMapping("/{id}")
    public WayPointResponseDto getById(@PathVariable Long id) {
        WayPoint wayPointById = wayPointService.getById(id);
        return wayPointMapperImpl.mapToDto(wayPointById);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        wayPointService.deleteById(id);
    }

    @PostMapping("/{id}")
    public WayPointResponseDto update(@PathVariable Long id,
                                      @RequestBody WayPointRequestDto requestDto) {
        WayPoint wayPoint = wayPointMapperImpl.mapToModel(requestDto);
        wayPoint.setId(id);
        return wayPointMapperImpl.mapToDto(wayPointService.save(wayPoint));
    }

    @GetMapping("/findAll")
    public List<WayPointResponseDto> findAll() {
        return wayPointService.findAll()
                .stream()
                .map(wayPointMapperImpl::mapToDto)
                .collect(Collectors.toList());
    }
}
