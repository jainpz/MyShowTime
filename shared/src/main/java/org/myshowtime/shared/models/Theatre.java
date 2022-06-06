package org.myshowtime.shared.models;

import lombok.Getter;
import org.myshowtime.shared.models.City;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "THEATRE")
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theatreId")
    private int theatreId;
    private String theatreName;


}
