package com.prova.netflics.repository;

import com.prova.netflics.dao.ActorDao;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActorRepository extends MongoRepository<ActorDao, String> {


}
