package com.prova.netflics.service;

import com.prova.netflics.dto.ImageDTO;

import java.util.Optional;

public interface ImageService {
    Optional<ImageDTO> getImageByName(String fileName);


}
