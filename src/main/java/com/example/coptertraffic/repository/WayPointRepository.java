package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.WayPoint;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WayPointRepository extends JpaRepository<WayPoint, Long> {
    WayPoint getById(Long id);

    List<WayPoint> findAll();
}
