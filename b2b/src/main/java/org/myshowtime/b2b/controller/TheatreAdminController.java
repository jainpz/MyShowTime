package org.myshowtime.b2b.controller;

import io.swagger.annotations.Api;
import org.myshowtime.b2b.database.CityTheatreRepository;
import org.myshowtime.b2b.models.CityTheatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "Theatre Administration")
@RequestMapping("/theatre/admin")
public class TheatreAdminController {

    private CityTheatreRepository cityTheatreRepository;

    public TheatreAdminController(@Autowired CityTheatreRepository cityTheatreRepository) {
        this.cityTheatreRepository = cityTheatreRepository;
    }


    @PostMapping("/onBoardTheatreToCity")
    public void onBoardTheatreToCity(@RequestBody CityTheatre cityTheatre) {
        cityTheatreRepository.save(cityTheatre);
    }

    @DeleteMapping("/removeTheatreFromCity")
    public void removeTheatreFromCity(@RequestBody CityTheatre cityTheatre) {
        cityTheatreRepository.delete(cityTheatre);
    }

}
