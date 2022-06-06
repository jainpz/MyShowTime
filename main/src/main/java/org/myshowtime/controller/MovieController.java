package org.myshowtime.controller;

import org.myshowtime.database.MovieRepository;
import org.myshowtime.shared.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myshowtime/admin")
public class MovieController {

    private MovieRepository movieRepository;

    public MovieController(@Autowired MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @PostMapping("/newMovie")
    public void newMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
    }

    @DeleteMapping("/removeMovie")
    public void removeMovie(@RequestBody Movie movie) {
        movieRepository.delete(movie);
    }
}
