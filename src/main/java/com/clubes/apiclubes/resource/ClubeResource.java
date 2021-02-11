package com.clubes.apiclubes.resource;

import com.clubes.apiclubes.dto.ClubeDTO;
import com.clubes.apiclubes.entity.ClubeEntity;
import com.clubes.apiclubes.repository.ClubeRepository;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/clube")
public class ClubeResource {

    @Autowired
    private ClubeRepository clubeRepository;

    @PostMapping("/")
    public void adicionaClube(@RequestBody ClubeDTO clubeDTO){
        ClubeEntity clubeEntity = ClubeEntity.builder()
                .nome(clubeDTO.getNome())
                .nomeTreinador(clubeDTO.getNomeTreinador())
                .qtdTitulosNacionais(clubeDTO.getQtdTitulosNacionais())
                .qtdTitulosInternacionais(clubeDTO.getQtdTitulosInternacionais())
                .build();

        try{
            clubeRepository.save(clubeEntity);
        }catch (Exception e){
            System.out.println("Erro ao inserir clube!");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClubeDTO> buscaClubePorId(@PathVariable("id") Long id){

        try{
            ClubeEntity clubeEntity = clubeRepository.getOne(id);

            ClubeDTO clubeDTO = ClubeDTO.builder()
                    .id(clubeEntity.getId())
                    .nome(clubeEntity.getNome())
                    .nomeTreinador(clubeEntity.getNomeTreinador())
                    .qtdTitulosNacionais(clubeEntity.getQtdTitulosNacionais())
                    .qtdTitulosInternacionais(clubeEntity.getQtdTitulosInternacionais())
                    .build();

            return ResponseEntity.ok(clubeDTO);
        }catch(Exception e){
            return null;
        }

    }
}
