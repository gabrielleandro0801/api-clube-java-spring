package com.clubes.apiclubes.dto;

public class ClubeRq {
    private String nome;
    private int qtd_titulos_nacionais;
    private int qtd_titulos_internacionais;
    private String nome_treinador;

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
