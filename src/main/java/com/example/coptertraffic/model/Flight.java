package com.example.coptertraffic.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

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
    @JoinTable(name = "flights_waypoints",
            joinColumns = @JoinColumn(name = "flight_id"),
            inverseJoinColumns = @JoinColumn(name = "way_points_id"))
    private List<WayPoint> wayPoints;
    @OneToMany
    @JoinTable(name = "flights_passed_points",
            joinColumns = @JoinColumn(name = "flight_id"),
            inverseJoinColumns = @JoinColumn(name = "passed_points_id"))
    private List<TemporaryPoint> passedPoints;
}
