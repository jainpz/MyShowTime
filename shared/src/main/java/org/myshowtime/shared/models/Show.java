package org.myshowtime.shared.models;


import lombok.Getter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SHOW")
@Getter
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showId;
    private String showName;
    private Date startTime;
    private Date endTime;

    @ManyToOne()
    @JoinColumn(name="theatreCityId")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "cityTheatreId")
    private Theatre theatre;

    @ManyToOne()
    @JoinColumn(name = "movieId")
    private Movie movie;

}
