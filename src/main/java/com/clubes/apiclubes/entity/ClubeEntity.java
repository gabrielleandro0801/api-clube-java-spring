package com.clubes.apiclubes.entity;

import com.clubes.apiclubes.dto.ClubeDTO;
import javax.persistence.*;

@Entity
@Table(name = "clube")
public class ClubeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "qtd_titulos_nacionais")
    private int qtd_titulos_nacionais;

    @Column(name = "qtd_titulos_internacionais")
    private int qtd_titulos_internacionais;

    @Column(name = "nome_treinador")
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

    public ClubeEntity(ClubeDTO clubeDTO){
        this.id = clubeDTO.getId();
        this.nome = clubeDTO.getNome();
        this.qtd_titulos_nacionais = clubeDTO.getQtd_titulos_nacionais();
        this.qtd_titulos_internacionais = clubeDTO.getQtd_titulos_internacionais();
        this.nome_treinador = clubeDTO.getNome_treinador();
    }

    public ClubeEntity() {

    }
}
