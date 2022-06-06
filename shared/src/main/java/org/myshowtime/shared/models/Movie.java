package org.myshowtime.shared.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieId")
    private int movieId;
    private String movieName;
    private int languageId;
    private int genreId;

}


