package com.example.coptertraffic.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "airplanes")
public class Airplane {
    @Id
    @GeneratedValue(generator = "airplane_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "airplane_id_seq",
            sequenceName = "airplane_id_seq",
            allocationSize = 1)
    private Long id;
    @OneToOne
    private AirplaneCharacteristics characteristics;
    @OneToOne
    private TemporaryPoint position;
    @OneToMany
    private List<Flight> flights;
}
