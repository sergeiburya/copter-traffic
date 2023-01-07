package com.example.coptertraffic.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "flights")
public class Flight {
    @Id
    private Long id;
    private Long number;
    @OneToMany
    private List<WayPoint> wayPoints;
    @OneToMany
    private List<TemporaryPoint> passedPoints;
}
