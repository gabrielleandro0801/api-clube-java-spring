package com.clubes.apiclubes.resource;

import com.clubes.apiclubes.dto.ClubeDTO;
import com.clubes.apiclubes.entity.ClubeEntity;
import com.clubes.apiclubes.repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clube")
public class ClubeResource {
    @Autowired
    private final ClubeRepository clubeRepository;
    private final ClubeDTO.RepresentationBuilder clubeRB;

    public ClubeResource(ClubeRepository clubeRepository, ClubeDTO.RepresentationBuilder clubeRB) {
        this.clubeRepository = clubeRepository;
        this.clubeRB = clubeRB;
    }

    @PostMapping("/")
    public void adicionaClube(@RequestBody ClubeDTO clubeDTO){
        ClubeEntity clubeFromRepresentation = clubeRB.fromRepresentation(clubeDTO, ClubeEntity.Builder.create());

        try{
            clubeRepository.save(clubeFromRepresentation);
        }catch (Exception e){
            System.out.println("Erro ao inserir clube!");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClubeDTO> buscaClubePorId(@PathVariable("id") Long id){
        ClubeEntity clubeEntity = clubeRepository.getOne(id);
        ClubeDTO clubeDTO = clubeRB.toRepresentation(clubeEntity);
        return ResponseEntity.ok(clubeDTO);

    }
}
