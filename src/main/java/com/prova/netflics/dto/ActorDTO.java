package com.prova.netflics.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class ActorDTO {
    private String id;
    private String name;
    private String nationality;
    private Date dateOfBirth;
}
