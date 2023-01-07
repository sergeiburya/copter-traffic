package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.AirplaneCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneCharacteristicsRepository
        extends JpaRepository<AirplaneCharacteristics, Long> {
}
