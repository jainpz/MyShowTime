package org.myshowtime.controller;

import org.myshowtime.b2b.database.TheatreRepository;
import org.myshowtime.b2b.models.CityTheatre;
import org.myshowtime.database.MovieRepository;
import org.myshowtime.shared.models.Theatre;
import org.myshowtime.database.CityRepository;
import org.myshowtime.shared.models.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myshowtime/admin")
public class PlatformController {

    private CityRepository cityRepository;
    private TheatreRepository theatreRepository;
    private MovieRepository movieRepository;

    public PlatformController(@Autowired CityRepository cityRepository,
                              @Autowired TheatreRepository theatreRepository,
                              @Autowired MovieRepository movieRepository) {
        this.cityRepository = cityRepository;
        this.theatreRepository = theatreRepository;
        this.movieRepository = movieRepository;

    }

    @PostMapping("/onBoardCity")
    public void onboardCity(@RequestBody City city){
        cityRepository.save(city);
    }

    @PostMapping("/onBoardTheatre")
    public void onBoardTheatre(@RequestBody Theatre theatre) {
        theatreRepository.save(theatre);
    }

    @DeleteMapping("/removeTheatre")
    public void removeTheatre(@RequestBody Theatre theatre) {
        theatreRepository.delete(theatre);
    }

    @PostMapping("/launchTheatreInCity")
    public void launchTheatreInCity(@RequestBody CityTheatre theatre){
    }
}
