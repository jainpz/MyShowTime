package org.myshowtime.b2c.controller;

import org.myshowtime.shared.database.ShowRepository;
import org.myshowtime.shared.models.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowBookingController {

    @Autowired
    ShowRepository showRepository;

    @GetMapping("/show/user/book")
    public Show bookShow(){
        return new Show();
    }

    @GetMapping("/show/user/listShows")
    public List<Show> getShows(@RequestBody Show show){
        return null;
    }

    private List<Show> getShowsByCity(){
        return null;
    }

    private List<Show> getAllShows(){
        return showRepository.findAll();
    }

    private List<Show> getShowsByMovie(){
        return null;
    }

    private List<Show> getShowsByLanguage(){
        return null;
    }

    private List<Show> getShowsByGenre(){
        return null;
    }

}
