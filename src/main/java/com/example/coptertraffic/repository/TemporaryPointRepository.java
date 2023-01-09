package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.TemporaryPoint;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemporaryPointRepository extends JpaRepository<TemporaryPoint, Long> {
    TemporaryPoint getById(Long id);

    List<TemporaryPoint> findAll();
}
