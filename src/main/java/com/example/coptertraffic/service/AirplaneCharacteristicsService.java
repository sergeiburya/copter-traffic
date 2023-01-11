package com.example.coptertraffic.service;

import com.example.coptertraffic.model.AirplaneCharacteristics;
import java.util.List;

public interface AirplaneCharacteristicsService {
    AirplaneCharacteristics save(AirplaneCharacteristics airplaneCharacteristics);

    AirplaneCharacteristics getById(Long id);

    void deleteById(Long id);

    List<AirplaneCharacteristics> findAll();
}
