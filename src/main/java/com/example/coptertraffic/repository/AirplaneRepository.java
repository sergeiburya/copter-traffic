package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane, Long> {
}
