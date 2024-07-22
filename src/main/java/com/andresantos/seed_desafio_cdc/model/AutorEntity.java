package com.andresantos.seed_desafio_cdc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AutorEntity {

    @Id
    private String email;
}
