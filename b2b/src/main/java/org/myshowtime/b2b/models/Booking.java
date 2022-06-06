package org.myshowtime.b2b.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="BOOKING")
@Getter
@Setter
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entryId;
    private int bookingId;
    private int seatNo;
    private int showId;
    private SeatStatus seatStatus;

    public enum SeatStatus {
        AVAILABLE("AVAILABLE"),
        BOOKED("BOOKED");
        public final String label;
        SeatStatus(String label) {
            this.label = label;
        }

    }
}
