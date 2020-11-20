package com.clubes.apiclubes.entity;

import com.clubes.apiclubes.dto.ClubeDTO;
import javax.persistence.*;

@Entity
@Table(name = "clube")
public class ClubeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Integer qtdTitulosNacionais;

    private Integer qtdTitulosInternacionais;

    private String nomeTreinador;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdTitulosNacionais() {
        return qtdTitulosNacionais;
    }
    private void setQtdTitulosNacionais(Integer qtdTitulosNacionais) {
        this.qtdTitulosNacionais = qtdTitulosNacionais;
    }

    public Integer getQtdTitulosInternacionais() {
        return qtdTitulosInternacionais;
    }
    private void setQtdTitulosInternacionais(Integer qtdTitulosInternacionais) {
        this.qtdTitulosInternacionais = qtdTitulosInternacionais;
    }

    public String getNomeTreinador() {
        return nomeTreinador;
    }
    private void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public static class Builder implements BaseBuilder<ClubeEntity> {

        private ClubeEntity entity;

        public Builder(ClubeEntity entity) {
            this.entity = entity;
        }

        public static Builder create() {
            return new Builder(new ClubeEntity());
        }

        public static Builder from(ClubeEntity entity) {
            return new Builder(entity);
        }

        public Builder nome(String nome) {
            this.entity.setNome(nome);
            return this;
        }

        public Builder qtdTitulosNacionais(Integer qtdTitulosN) {
            this.entity.setQtdTitulosNacionais(qtdTitulosN);
            return this;
        }

        public Builder qtdTitulosInternacionais(Integer qtdTitulosI) {
            this.entity.setQtdTitulosInternacionais(qtdTitulosI);
            return this;
        }

        public Builder nomeTreinador(String nomeTreinador) {
            this.entity.setNomeTreinador(nomeTreinador);
            return this;
        }

        @Override
        public ClubeEntity build() {
            return this.entity;
        }
    }

}
