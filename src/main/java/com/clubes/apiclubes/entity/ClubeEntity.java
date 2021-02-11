package com.clubes.apiclubes.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clube")
public class ClubeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Integer qtdTitulosNacionais;

    private Integer qtdTitulosInternacionais;

    private String nomeTreinador;
}