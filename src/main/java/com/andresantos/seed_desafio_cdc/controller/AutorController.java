package com.andresantos.seed_desafio_cdc.controller;

import com.andresantos.seed_desafio_cdc.dto.CadastrarNovoAutorDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AutorController {

    @PostMapping("/autor")
    public Object cadastrarNovoAutor(@RequestBody CadastrarNovoAutorDTO novoAutorDTO){
        return novoAutorDTO;
    }
}
