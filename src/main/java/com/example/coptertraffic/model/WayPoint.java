package com.example.coptertraffic.model;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "way_points")
public class WayPoint {
    @Id
    private double latitude;
    private double longitude;
    private double spanHeight;
    private double overflightSpeed;
}