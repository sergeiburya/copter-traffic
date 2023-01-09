package com.example.coptertraffic.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

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
