package org.myshowtime.b2b.controller;

import io.swagger.annotations.Api;
import org.myshowtime.b2b.database.BookingRepository;
import org.myshowtime.b2b.models.Booking;
import org.myshowtime.shared.database.ShowRepository;
import org.myshowtime.shared.models.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/show/admin")
@Api(tags = "Show Booking")
public class ShowController {

    private ShowRepository showRepository;
    private BookingRepository bookingRepository;
    private int MAX_SEATS = 60;

    public ShowController(@Autowired ShowRepository showRepository, @Autowired BookingRepository bookingRepository) {
        this.showRepository = showRepository;
        this.bookingRepository = bookingRepository;
    }

    @PostMapping("/addShow")
    public void addShow(@RequestBody Show show){
        showRepository.save(show);
        createSeatsForShow(show);

    }

    @DeleteMapping("/removeShow")
    public void removeShow(@RequestBody Show show){
        showRepository.save(show);
    }

    private void createSeatsForShow(Show show) {
        List<Booking> seatList = getSeatList(show);
        bookingRepository.saveAll(seatList);
    }

    private List<Booking> getSeatList(Show show) {
        List<Booking> list = new ArrayList<>();
        for (int i = 1; i <= MAX_SEATS; i++) {
            Booking booking = new Booking();
            booking.setSeatNo(i);
            booking.setShowId(show.getShowId());
            booking.setSeatStatus(Booking.SeatStatus.AVAILABLE);
            list.add(booking);
        }
        return list;
    }

}
