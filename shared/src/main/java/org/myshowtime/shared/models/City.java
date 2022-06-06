package org.myshowtime.shared.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "CITY")
public class City {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "cityId")
    private int cityId;

    private String cityName;

}
