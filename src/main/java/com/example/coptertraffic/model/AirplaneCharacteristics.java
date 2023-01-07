package com.example.coptertraffic.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "airplane_characteristics")
public class AirplaneCharacteristics {
    @Id
    @GeneratedValue(generator = "airplane_characteristics_id_seq",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "airplane_characteristics_id_seq",
            sequenceName = "airplane_characteristics_id_seq",
            allocationSize = 1)
    private Long id;
    private double maxSpeed;
    private double acceleration;
    private double speedOfChangeAltitude;
    private double speedOfChangeCourse;
}
