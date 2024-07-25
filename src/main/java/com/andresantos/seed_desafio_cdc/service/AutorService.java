package com.andresantos.seed_desafio_cdc.service;

import com.andresantos.seed_desafio_cdc.dto.CadastrarNovoAutorEntradaDTO;
import com.andresantos.seed_desafio_cdc.dto.CadastrarNovoAutorSaidaDTO;
import com.andresantos.seed_desafio_cdc.model.AutorEntity;
import com.andresantos.seed_desafio_cdc.repository.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public CadastrarNovoAutorSaidaDTO salvarNovoAutor(CadastrarNovoAutorEntradaDTO cadastrarNovoAutorEntradaDTO){
        AutorEntity novoAutor = autorRepository.save(dtoToEntity(cadastrarNovoAutorEntradaDTO));
        return entityToDTO(novoAutor);
    }

    public AutorEntity dtoToEntity(CadastrarNovoAutorEntradaDTO dto){
        return new AutorEntity(dto.getEmail(), dto.getNome(), dto.getDescricao());
    }

    public CadastrarNovoAutorSaidaDTO entityToDTO(AutorEntity autorEntity){
        return new CadastrarNovoAutorSaidaDTO(autorEntity.getEmail(), autorEntity.getNome(),
                autorEntity.getDescricao(), autorEntity.getDataHoraCriacao());
    }
}
