package com.prova.netflics.Marshaller;

import com.prova.netflics.dao.TrailerDao;
import com.prova.netflics.dto.TrailerDTO;
import org.springframework.stereotype.Component;

@Component
public class TrailerMarshaller {

    public TrailerDTO toDTO(TrailerDao trailerDao) {
        if (trailerDao == null) {
            return null;
        }
        TrailerDTO trailerDTO = new TrailerDTO();
        trailerDTO.setId(trailerDao.getId());
        trailerDTO.setMovieTrailer(trailerDao.getMovieTrailer());
        trailerDTO.setVideoUrl(trailerDao.getVideoUrl());
        return trailerDTO;
    }

    public TrailerDao fromDTO(TrailerDTO trailerDTO) {
        if (trailerDTO == null) {
            return null;
        }
        TrailerDao trailerDao = new TrailerDao();
        trailerDao.setId(trailerDTO.getId());
        trailerDao.setMovieTrailer(trailerDTO.getMovieTrailer());
        trailerDao.setVideoUrl(trailerDTO.getVideoUrl());
        return trailerDao;
    }
}
