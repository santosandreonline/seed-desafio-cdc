package com.andresantos.seed_desafio_cdc.controller;

import com.andresantos.seed_desafio_cdc.dto.CadastrarNovoAutorEntradaDTO;
import com.andresantos.seed_desafio_cdc.dto.CadastrarNovoAutorSaidaDTO;
import com.andresantos.seed_desafio_cdc.service.AutorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping("/autor")
    public ResponseEntity<CadastrarNovoAutorSaidaDTO> cadastrarNovoAutor(@Valid @RequestBody CadastrarNovoAutorEntradaDTO novoAutorDTO){
        return ResponseEntity.ok(autorService.salvarNovoAutor(novoAutorDTO));
    }
}
