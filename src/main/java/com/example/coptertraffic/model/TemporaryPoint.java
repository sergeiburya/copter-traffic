package com.example.coptertraffic.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "temporary_points")
public class TemporaryPoint {
    @Id
    @GeneratedValue(generator = "temporary_point_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "temporary_point_id_seq",
            sequenceName = "temporary_point_id_seq",
            allocationSize = 1)
    private Long id;
    private double latitude;
    private double longitude;
    private double spanHeight;
    private double overflightSpeed;
    private double flightDirection;
}
