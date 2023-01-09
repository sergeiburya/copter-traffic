package com.example.coptertraffic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "way_points")
public class WayPoint {
    @Id
    @GeneratedValue(generator = "way_point_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "way_point_id_seq",
            sequenceName = "way_point_id_seq",
            allocationSize = 1)
    private Long id;
    private double latitude;
    private double longitude;
    private double spanHeight;
    private double overflightSpeed;
}
