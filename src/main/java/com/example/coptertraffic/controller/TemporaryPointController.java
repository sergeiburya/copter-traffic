package com.example.coptertraffic.controller;

import com.example.coptertraffic.dto.mapper.TemporaryPointMapper;
import com.example.coptertraffic.dto.request.TemporaryPointRequestDto;
import com.example.coptertraffic.dto.response.TemporaryPointResponseDto;
import com.example.coptertraffic.model.TemporaryPoint;
import com.example.coptertraffic.service.TemporaryPointService;
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
@RequestMapping("/temporary-point")
public class TemporaryPointController {
    private final TemporaryPointService temporaryPointService;
    private final TemporaryPointMapper pointMapper;

    public TemporaryPointController(TemporaryPointService temporaryPointService,
                                    TemporaryPointMapper pointMapper) {
        this.temporaryPointService = temporaryPointService;
        this.pointMapper = pointMapper;
    }

    @PostMapping("/add-temporary-point")
    public TemporaryPointResponseDto save(@RequestBody TemporaryPointRequestDto requestDto) {
        TemporaryPoint temporaryPoint = temporaryPointService.save(
                pointMapper.toModel(requestDto));
        return pointMapper.toResponseDto(temporaryPoint);
    }

    @GetMapping("/{id}")
    public TemporaryPointResponseDto getById(@PathVariable Long id) {
        TemporaryPoint pointById = temporaryPointService.getById(id);
        return pointMapper.toResponseDto(pointById);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        temporaryPointService.deleteById(id);
    }

    @GetMapping("/findAll")
    public List<TemporaryPointResponseDto> findAll() {
        return temporaryPointService.findAll()
                .stream()
                .map(pointMapper::toResponseDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/{id}")
    public TemporaryPointResponseDto update(@PathVariable long id,
                                            @RequestBody TemporaryPointRequestDto requestDto) {
        TemporaryPoint temporaryPoint = pointMapper.toModel(requestDto);
        temporaryPoint.setId(id);
        return pointMapper.toResponseDto(temporaryPointService.save(temporaryPoint));
    }
}
