package com.andresantos.seed_desafio_cdc.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CadastrarNovoAutorEntradaDTO {

    @NotNull(message = "Campo nome não pode ser nulo")
    @NotBlank(message = "Campo nome não pode ser vazio")
    private String nome;

    @NotNull(message = "Campo email não pode ser nulo")
    @NotBlank(message = "Campo email não pode ser vazio")
    @Email(message = "Formato inválido no campo email")
    private String email;

    @NotNull(message = "Campo descrição não pode ser nulo")
    @Size(min = 1, max = 400, message = "Campo descrição deve conter de 1 a 400 caracters")
    private String descricao;

    @Override
    public String toString() {
        return "CadastrarNovoAutorDTO{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
