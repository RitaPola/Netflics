package com.prova.netflics.dto;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;


import java.util.List;

@Getter
@Setter
public class MovieDTO {

    private ObjectId id;

    private List<String> actors;

    private String img;

    private String title;
    private Integer year;

    private String trailer;
}
