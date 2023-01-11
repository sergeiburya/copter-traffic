package com.example.coptertraffic.controller;

import com.example.coptertraffic.dto.mapper.impl.AirplaneCharacteristicsMapper;
import com.example.coptertraffic.dto.request.AirplaneCharacteristicsRequestDto;
import com.example.coptertraffic.dto.response.AirplaneCharacteristicsResponseDto;
import com.example.coptertraffic.model.AirplaneCharacteristics;
import com.example.coptertraffic.service.AirplaneCharacteristicsService;
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
@RequestMapping("/airplane-characteristic")
public class AirplaneCharacteristicsController {
    private final AirplaneCharacteristicsService characteristicsService;
    private final AirplaneCharacteristicsMapper characteristicsMapper;

    public AirplaneCharacteristicsController(AirplaneCharacteristicsService characteristicsService,
                                             AirplaneCharacteristicsMapper characteristicsMapper) {
        this.characteristicsService = characteristicsService;
        this.characteristicsMapper = characteristicsMapper;
    }

    @PostMapping("/add-airplane-characteristic")
    public AirplaneCharacteristicsResponseDto save(
            @RequestBody AirplaneCharacteristicsRequestDto requestDto) {
        AirplaneCharacteristics characteristics =
                characteristicsService.save(characteristicsMapper.mapToModel(requestDto));
        return characteristicsMapper.mapToDto(characteristics);
    }

    @GetMapping("/{id}")
    public AirplaneCharacteristicsResponseDto getById(@PathVariable Long id) {
        AirplaneCharacteristics characteristicsById = characteristicsService.getById(id);
        return characteristicsMapper.mapToDto(characteristicsById);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id) {
        characteristicsService.deleteById(id);
    }

    @GetMapping("/find-all")
    public List<AirplaneCharacteristicsResponseDto> findAll() {
        return characteristicsService.findAll()
                .stream()
                .map(characteristicsMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/{id}")
    public AirplaneCharacteristicsResponseDto update(
            @PathVariable Long id,
            @RequestBody AirplaneCharacteristicsRequestDto requestDto) {
        AirplaneCharacteristics characteristics = characteristicsMapper.mapToModel(requestDto);
        characteristics.setId(id);
        return characteristicsMapper.mapToDto(characteristicsService.save(characteristics));
    }
}
