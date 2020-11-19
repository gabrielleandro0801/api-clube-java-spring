package com.clubes.apiclubes.dto;
import lombok.*;
import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
public class ClubeDTO {
    @NotNull(message = "ID cannot be null")
    @NotEmpty(message = "ID must be a valid number")
    private Long id;

    @NotNull(message = "nome cannot be null")
    @NotEmpty(message = "nome must be a valid number")
    private String nome;

    @NotNull(message = "qtd_titulos_nacionais cannot be null")
    @NotEmpty(message = "qtd_titulos_nacionais must be a valid number")
    private int qtd_titulos_nacionais;

    @NotNull(message = "qtd_titulos_internacionais cannot be null")
    @NotEmpty(message = "qtd_titulos_internacionais must be a valid number")
    private int qtd_titulos_internacionais;

    @NotNull(message = "nome_treinador cannot be null")
    @NotEmpty(message = "nome_treinador must be a valid number")
    private String nome_treinador;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_titulos_nacionais() {
        return qtd_titulos_nacionais;
    }
    public void setQtd_titulos_nacionais(int qtd_titulos_nacionais) {
        this.qtd_titulos_nacionais = qtd_titulos_nacionais;
    }

    public int getQtd_titulos_internacionais() {
        return qtd_titulos_internacionais;
    }
    public void setQtd_titulos_internacionais(int qtd_titulos_internacionais) {
        this.qtd_titulos_internacionais = qtd_titulos_internacionais;
    }

    public String getNome_treinador() {
        return nome_treinador;
    }
    public void setNome_treinador(String nome_treinador) {
        this.nome_treinador = nome_treinador;
    }


}
