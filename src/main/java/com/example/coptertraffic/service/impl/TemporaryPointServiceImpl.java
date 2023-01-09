package com.example.coptertraffic.service.impl;

import com.example.coptertraffic.model.TemporaryPoint;
import com.example.coptertraffic.repository.TemporaryPointRepository;
import com.example.coptertraffic.service.TemporaryPointService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TemporaryPointServiceImpl implements TemporaryPointService {
    private final TemporaryPointRepository temporaryPointRepository;

    public TemporaryPointServiceImpl(TemporaryPointRepository temporaryPointRepository) {
        this.temporaryPointRepository = temporaryPointRepository;
    }

    @Override
    public TemporaryPoint save(TemporaryPoint temporaryPoint) {
        return temporaryPointRepository.save(temporaryPoint);
    }

    @Override
    public TemporaryPoint getById(Long id) {
        return temporaryPointRepository.getById(id);
    }

    @Override
    public List<TemporaryPoint> findAll() {
        return temporaryPointRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        temporaryPointRepository.deleteById(id);
    }
}
