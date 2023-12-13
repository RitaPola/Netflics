package com.prova.netflics.service;

import com.prova.netflics.Marshaller.MovieMarshaller;
import com.prova.netflics.dao.MovieDao;
import com.prova.netflics.dto.MovieDTO;
import com.prova.netflics.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Slf4j
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final MovieMarshaller movieMarshaller;


    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository, MovieMarshaller movieMarshaller) {
        this.movieRepository = movieRepository;
        this.movieMarshaller = movieMarshaller;
    }

    @Override
    public Optional<MovieDTO> getMovieByTitle(String title) {
        log.info("Searching for movie with title: {}", title);
        return movieRepository.findMovieDaoByTitleIgnoreCase(title.trim())
                .map(movieDao -> {
                    log.info("Movie found: {}", movieDao.getTitle());
                    return movieMarshaller.toDTO(movieDao);
                });
    }
    @Override
    public MovieDTO createMovie(MovieDTO movieDTO) {
        MovieDao movieDao = movieMarshaller.fromDTO(movieDTO);
        MovieDao savedMovieDao = movieRepository.save(movieDao);
        return movieMarshaller.toDTO(savedMovieDao);
    }

    @Override
    public List<MovieDTO> getAllMovies() {
      List <MovieDao> movieDao = movieRepository.findAll();
        return movieDao.stream()
              .map(movieMarshaller::toDTO)
              .collect(Collectors.toList());
    }

    @Override
    public boolean deleteMovieByTitle(String title) {
        if (movieRepository.existsByTitleIgnoreCase(title)) {
                movieRepository.deleteMovieDaoByTitle(title);
                return true;
        }else {
            return false;
        }
    }
}
