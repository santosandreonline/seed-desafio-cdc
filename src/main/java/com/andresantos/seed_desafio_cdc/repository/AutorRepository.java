package com.andresantos.seed_desafio_cdc.repository;

import com.andresantos.seed_desafio_cdc.model.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, String> {
}
