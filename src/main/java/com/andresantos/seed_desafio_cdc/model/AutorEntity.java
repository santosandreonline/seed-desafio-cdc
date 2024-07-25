package com.andresantos.seed_desafio_cdc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "autores")
public class AutorEntity {

    public AutorEntity() { }

    public AutorEntity(String email, String nome, String descricao) {
        this.email = email;
        this.nome = nome;
        this.descricao = descricao;
        this.dataHoraCriacao = LocalDateTime.now();
    }

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "descricao", nullable = false, length = 400)
    private String descricao;

    @Column(name = "data_hora_criacao", nullable = false)
    private LocalDateTime dataHoraCriacao;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }
}
