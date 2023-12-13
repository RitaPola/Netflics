package com.prova.netflics.repository;

import com.prova.netflics.dao.MovieDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<MovieDao, String> {

    Optional<MovieDao> findMovieDaoByTitleIgnoreCase(String title);

    @Query(value= "{'title' : ?0 }", delete = true)
    void deleteMovieDaoByTitle(@Param("title")String title);

    boolean existsByTitleIgnoreCase(String title);

}
