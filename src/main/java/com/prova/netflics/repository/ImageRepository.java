package com.prova.netflics.repository;

import com.prova.netflics.dao.ImageDao;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ImageRepository extends MongoRepository<ImageDao, String> {

    Optional<ImageDao> findImageDaoByFilenameIgnoreCase(String fileName);

}
