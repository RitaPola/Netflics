package com.prova.netflics.service;

import com.prova.netflics.Marshaller.ImageMarshaller;
import com.prova.netflics.dto.ImageDTO;
import com.prova.netflics.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageSreviceImpl implements ImageService {

    private final ImageRepository imageRepository;
    private final ImageMarshaller imageMarshaller;
    @Autowired
    public ImageSreviceImpl(ImageRepository imageRepository,ImageMarshaller imageMarshaller) {
        this.imageRepository = imageRepository;
        this.imageMarshaller=imageMarshaller;
    }

    @Override
    public Optional<ImageDTO> getImageByName(String imageName) {
        return imageRepository.findImageDaoByFilenameIgnoreCase(imageName.trim())
                .map(imageMarshaller::toDTO);
    }
}
