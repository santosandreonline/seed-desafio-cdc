package com.andresantos.seed_desafio_cdc.dto;

import java.time.LocalDateTime;

public record CadastrarNovoAutorSaidaDTO(String email, String nome, String descricao,
                                         LocalDateTime dataHoraCriacao) {

}
