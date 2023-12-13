package com.prova.netflics.Marshaller;

import com.prova.netflics.dao.MovieDao;
import com.prova.netflics.dto.MovieDTO;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class MovieMarshaller {
    public MovieDTO toDTO(MovieDao movieDao) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(movieDao.getId());
        movieDTO.setTitle(movieDao.getTitle());
        movieDTO.setYear(movieDao.getYear());
        movieDTO.setImg(movieDao.getImg());
        movieDTO.setTrailer(movieDao.getTrailer());
        movieDTO.setActors(movieDao.getActors());

        return movieDTO;
    }

    public MovieDao fromDTO(MovieDTO movieDto) {
        if (movieDto == null) {
            return null;
        }
        MovieDao movieDao = new MovieDao();
        movieDao.setId(movieDto.getId());
        movieDao.setTitle(movieDto.getTitle());
        movieDao.setYear(movieDto.getYear());
        movieDao.setImg(movieDto.getImg());
        movieDao.setTrailer(movieDto.getTrailer());
        movieDao.setActors(movieDto.getActors() != null ? new ArrayList<>(movieDto.getActors()) : null);

        return movieDao;
    }

}
