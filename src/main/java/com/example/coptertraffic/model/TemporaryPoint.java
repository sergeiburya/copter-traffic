package com.example.coptertraffic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "temporary_points")
public class TemporaryPoint {
    @Id
    private Long id;
    private double latitude;
    private double longitude;
    private double spanHeight;
    private double overflightSpeed;
    private double flightDirection;
}
