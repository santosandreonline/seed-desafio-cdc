package com.andresantos.seed_desafio_cdc.controller;

import com.andresantos.seed_desafio_cdc.dto.CadastrarNovoAutorDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AutorController {

    @PostMapping("/autor")
    public ResponseEntity<CadastrarNovoAutorDTO> cadastrarNovoAutor(@Valid @RequestBody CadastrarNovoAutorDTO novoAutorDTO){
        return ResponseEntity.ok(novoAutorDTO);
    }
}
