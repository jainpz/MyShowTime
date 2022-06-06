package org.myshowtime.b2c.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "Ticket")
public class Ticket {

    @Id
    private long ticketId;
    private int bookingId;
    private int showId;

}
