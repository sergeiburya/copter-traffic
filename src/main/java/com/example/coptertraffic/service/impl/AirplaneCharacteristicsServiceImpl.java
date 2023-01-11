package com.example.coptertraffic.service.impl;

import com.example.coptertraffic.model.AirplaneCharacteristics;
import com.example.coptertraffic.repository.AirplaneCharacteristicsRepository;
import com.example.coptertraffic.service.AirplaneCharacteristicsService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AirplaneCharacteristicsServiceImpl implements AirplaneCharacteristicsService {
    private final AirplaneCharacteristicsRepository repository;

    public AirplaneCharacteristicsServiceImpl(AirplaneCharacteristicsRepository repository) {
        this.repository = repository;
    }

    @Override
    public AirplaneCharacteristics save(AirplaneCharacteristics airplaneCharacteristics) {
        return repository.save(airplaneCharacteristics);
    }

    @Override
    public AirplaneCharacteristics getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<AirplaneCharacteristics> findAll() {
        return repository.findAll();
    }
}
