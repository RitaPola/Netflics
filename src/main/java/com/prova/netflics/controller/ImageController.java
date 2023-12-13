package com.prova.netflics.controller;


import com.prova.netflics.dto.ImageDTO;
import com.prova.netflics.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("images")
public class ImageController {
    private ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }
    @GetMapping("/name/{nameImage}")
    public ResponseEntity getImageByName (@PathVariable String nameImage){

        Optional<ImageDTO> image = imageService.getImageByName(nameImage);
        if(image.isPresent()){
            return new ResponseEntity<>(image, HttpStatus.OK);
        }
        return new ResponseEntity<>(image, HttpStatus.NOT_FOUND);
    }



}
