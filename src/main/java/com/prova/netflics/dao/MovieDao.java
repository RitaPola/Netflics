package com.prova.netflics.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "movies")
public class MovieDao {
    @Id
    private ObjectId id;
    @Indexed
    @Field
    private List<String> actors;
    private String img;
    @Field
    private String title;
    private Integer year;

    @Indexed
    private String trailer;
}
