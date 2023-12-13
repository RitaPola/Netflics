package com.prova.netflics.controller;

import com.prova.netflics.dto.MovieDTO;
import com.prova.netflics.exceptionCustom.ConnectException;
import com.prova.netflics.exceptionCustom.MovieNotFoundException;
import com.prova.netflics.service.MovieService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/movies")
@Slf4j
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService=movieService;
    }
    @GetMapping("/title/{titleMovie}")
    public ResponseEntity getMovieByTitle(@PathVariable @NonNull String titleMovie) {
        Optional<MovieDTO> movie = movieService.getMovieByTitle(titleMovie);

        if (movie.isPresent()) {
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
        } else {
            log.error("Movie not found with name {}", titleMovie);
            throw new MovieNotFoundException("Movie with name not found: " + titleMovie);
        }
    }
   @PostMapping("/")
    public ResponseEntity createMovie(@RequestBody MovieDTO movieDTO){
       try {
           MovieDTO createdMovie = movieService.createMovie(movieDTO);
           return new ResponseEntity<>(createdMovie, HttpStatus.CREATED);
       } catch (Exception e) {
           throw new ConnectException("Errore di connessione durante la creazione del film", e);
       }
    }
    @GetMapping("/getAllMovies")
    public ResponseEntity<List<MovieDTO>> getAllMovies() {
        try {
            List<MovieDTO> movies = movieService.getAllMovies();
            return new ResponseEntity<>(movies, HttpStatus.OK);
        }catch(ConnectException ex) {
            throw new MovieNotFoundException("Non sono stati trovati i film ", ex);
        }
    }
    @DeleteMapping("/deleteMovie/{title}")
    public ResponseEntity<String> deleteMovie (@PathVariable String title){
        boolean isDeleted = movieService.deleteMovieByTitle(title);
        if (isDeleted) {
            return ResponseEntity.ok("Film eliminato con successo. ");
        } else {
            throw new  MovieNotFoundException("Movie not found with the title : " + title);
        }
    }


}
