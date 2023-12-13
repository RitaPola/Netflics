package com.prova.netflics.repository;

import com.prova.netflics.dao.TrailerDao;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TrailerRepository extends MongoRepository<TrailerDao, String> {

    Optional <TrailerDao> findByMovieTrailer(String movieTrailer);
}
