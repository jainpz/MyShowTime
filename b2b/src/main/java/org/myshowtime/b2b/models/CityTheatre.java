package org.myshowtime.b2b.models;

import lombok.Getter;
import org.myshowtime.shared.models.City;
import org.myshowtime.shared.models.Theatre;

import javax.persistence.*;

@Entity
@Table(name = "CITY_THEATRES")
@Getter
public class CityTheatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityTheatreId;


    @ManyToOne
    @JoinColumn(name="theatreId")
    private Theatre theatre;

    @ManyToOne
    @JoinColumn(name="cityId")
    private City city;

}
