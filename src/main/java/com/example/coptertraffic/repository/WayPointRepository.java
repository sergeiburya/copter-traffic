package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.WayPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WayPointRepository extends JpaRepository<WayPoint, Long> {
}
