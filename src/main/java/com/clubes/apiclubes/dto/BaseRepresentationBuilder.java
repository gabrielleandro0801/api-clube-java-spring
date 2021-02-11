package com.clubes.apiclubes.dto;

import com.clubes.apiclubes.entity.BaseBuilder;
import com.clubes.apiclubes.entity.ClubeEntity;
import org.springframework.stereotype.Component;

public interface BaseRepresentationBuilder<E, D, B> {

    D toRepresentation(E entity);

    E fromRepresentation(D representation, B builder);

//    public static class Builder implements BaseBuilder<ClubeDTO> {
//
//        private ClubeDTO entity;
//
//        public Builder(ClubeDTO entity) {
//            this.entity = entity;
//        }
//
//        public static Builder create() {
//            return new Builder(new ClubeDTO());
//        }
//
//        public static Builder from(ClubeDTO entity) {
//            return new Builder(entity);
//        }
//
//        public Builder id(Long id) {
//            this.entity.setId(id);
//            return this;
//        }
//
//        public Builder nome(String nome) {
//            this.entity.setNome(nome);
//            return this;
//        }
//
//        public Builder qtdTitulosNacionais(Integer qtdTitulosN) {
//            this.entity.setQtdTitulosNacionais(qtdTitulosN);
//            return this;
//        }
//
//        public Builder qtdTitulosInternacionais(Integer qtdTitulosI) {
//            this.entity.setQtdTitulosInternacionais(qtdTitulosI);
//            return this;
//        }
//
//        public Builder nomeTreinador(String nomeTreinador) {
//            this.entity.setNomeTreinador(nomeTreinador);
//            return this;
//        }
//
//        @Override
//        public ClubeDTO build() {
//            return this.entity;
//        }
//    }
//
//    @Component
//    public static class RepresentationBuilder implements BaseRepresentationBuilder<ClubeEntity, ClubeDTO, ClubeEntity.Builder> {
//
//        @Override
//        public ClubeDTO toRepresentation(ClubeEntity entity) {
//            return ClubeDTO.Builder.create()
//                    .id(entity.getId())
//                    .nome(entity.getNome())
//                    .qtdTitulosNacionais(entity.getQtdTitulosNacionais())
//                    .qtdTitulosInternacionais(entity.getQtdTitulosInternacionais())
//                    .nomeTreinador(entity.getNomeTreinador())
//                    .build();
//        }
//
//        @Override
//        public ClubeEntity fromRepresentation(ClubeDTO representation, ClubeEntity.Builder builder) {
//            return builder
//                    .nome(representation.getNome())
//                    .qtdTitulosNacionais(representation.getQtdTitulosNacionais())
//                    .qtdTitulosInternacionais(representation.getQtdTitulosInternacionais())
//                    .nomeTreinador(representation.getNomeTreinador())
//                    .build();
//        }
//    }

}
