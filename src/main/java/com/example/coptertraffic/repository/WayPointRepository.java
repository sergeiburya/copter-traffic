package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.WayPoint;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WayPointRepository extends JpaRepository<WayPoint, Long> {
    WayPoint getById(Long id);

    List<WayPoint> findAll();
}
