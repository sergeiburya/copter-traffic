package com.example.coptertraffic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(generator = "flight_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "flight_id_seq",
            sequenceName = "flight_id_seq",
            allocationSize = 1)
    private Long id;
    private Long number;
    @OneToMany
    private List<WayPoint> wayPoints;
    @OneToMany
    private List<TemporaryPoint> passedPoints;
}
