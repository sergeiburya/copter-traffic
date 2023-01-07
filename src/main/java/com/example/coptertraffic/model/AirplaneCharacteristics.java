package com.example.coptertraffic.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "airplane_characteristics")
public class AirplaneCharacteristics {
    @Id
    private Long id;
    private double maxSpeed;
    private double acceleration;
    private double speedOfChangeAltitude;
    private double speedOfChangeCourse;
}
