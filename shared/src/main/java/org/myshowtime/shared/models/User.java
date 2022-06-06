package org.myshowtime.shared.models;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private boolean isPartner;
}
