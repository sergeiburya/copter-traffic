package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.AirplaneCharacteristics;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneCharacteristicsRepository
        extends JpaRepository<AirplaneCharacteristics, Long> {
    AirplaneCharacteristics getById(Long id);

    List<AirplaneCharacteristics> findAllBy();
}
