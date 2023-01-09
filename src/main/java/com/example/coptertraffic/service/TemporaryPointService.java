package com.example.coptertraffic.service;

import com.example.coptertraffic.model.TemporaryPoint;
import java.util.List;

public interface TemporaryPointService {
    TemporaryPoint save(TemporaryPoint temporaryPoint);

    TemporaryPoint getById(Long id);

    List<TemporaryPoint> findAll();

    void deleteById(Long id);
}
