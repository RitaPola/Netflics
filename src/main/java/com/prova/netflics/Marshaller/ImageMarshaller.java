package com.prova.netflics.Marshaller;

import com.prova.netflics.dao.ImageDao;
import com.prova.netflics.dto.ImageDTO;
import org.springframework.stereotype.Component;

@Component
public class ImageMarshaller {
    public ImageDTO toDTO(ImageDao imageDao) {
        if (imageDao == null) {
            return null;
        }
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setId(imageDao.getId());
        imageDTO.setFilename(imageDao.getFilename());
        imageDTO.setUrl(imageDao.getUrl());
        return imageDTO;
    }

    public ImageDao fromDTO(ImageDTO imageDTO) {
        if (imageDTO == null) {
            return null;
        }
        ImageDao imageDao = new ImageDao();
        imageDao.setId(imageDTO.getId());
        imageDao.setFilename(imageDTO.getFilename());
        imageDao.setUrl(imageDTO.getUrl());
        return imageDao;
    }
}
