package com.corhuila.shoppingcar.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "cliente")
public class Cliente {
    @Id
    private String id;
    @Field
    private String nombre;

    @Field
    private String email;



}
