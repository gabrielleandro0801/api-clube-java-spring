package com.clubes.apiclubes.dto;
import com.clubes.apiclubes.entity.BaseBuilder;
import com.clubes.apiclubes.entity.ClubeEntity;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Getter
@Setter
public class ClubeDTO {
    private Long id;
    private String nome;
    private int qtdTitulosNacionais;
    private int qtdTitulosInternacionais;
    private String nomeTreinador;
}
