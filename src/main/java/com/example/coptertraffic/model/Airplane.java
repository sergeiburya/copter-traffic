package com.example.coptertraffic.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "airplanes")
public class Airplane {
    @Id
    private Long id;
    @OneToOne
    private AirplaneCharacteristics characteristics;
    @OneToOne
    private TemporaryPoint position;
    @OneToMany
    private List<Flight> flights;
}
