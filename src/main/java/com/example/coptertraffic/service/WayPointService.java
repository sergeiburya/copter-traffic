package com.example.coptertraffic.service;

import com.example.coptertraffic.model.WayPoint;
import java.util.List;

public interface WayPointService {
    WayPoint save(WayPoint wayPoint);

    WayPoint getById(Long id);

    List<WayPoint> findAll();

    void deleteById(Long id);
}
