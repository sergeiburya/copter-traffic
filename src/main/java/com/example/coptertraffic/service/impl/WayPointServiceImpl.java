package com.example.coptertraffic.service.impl;

import com.example.coptertraffic.model.WayPoint;
import com.example.coptertraffic.repository.WayPointRepository;
import com.example.coptertraffic.service.WayPointService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WayPointServiceImpl implements WayPointService {
    private final WayPointRepository wayPointRepository;

    public WayPointServiceImpl(WayPointRepository wayPointRepository) {
        this.wayPointRepository = wayPointRepository;
    }

    @Override
    public WayPoint save(WayPoint wayPoint) {
        return wayPointRepository.save(wayPoint);
    }

    @Override
    public WayPoint getById(Long id) {
        return wayPointRepository.getById(id);
    }

    @Override
    public List<WayPoint> findAll() {
        return wayPointRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        wayPointRepository.deleteById(id);
    }
}
