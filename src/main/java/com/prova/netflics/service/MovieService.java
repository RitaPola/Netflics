package com.prova.netflics.service;

import com.prova.netflics.dto.MovieDTO;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Optional<MovieDTO> getMovieByTitle(String title);
    MovieDTO createMovie (MovieDTO movieDTO);
    List <MovieDTO> getAllMovies();
    boolean deleteMovieByTitle(String title);

}
