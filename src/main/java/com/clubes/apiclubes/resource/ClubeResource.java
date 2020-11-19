package com.clubes.apiclubes.resource;

import com.clubes.apiclubes.dto.ClubeRq;
import com.clubes.apiclubes.dto.ClubeRs;
import com.clubes.apiclubes.entity.ClubeEntity;
import com.clubes.apiclubes.repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clube")
public class ClubeResource {
    @Autowired
    private final ClubeRepository clubeRepository;

    public ClubeResource(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }

    @PostMapping("/")
    public void adiciona_clube(@RequestBody ClubeRq clubeRq) throws Exception{
        var clube = new ClubeEntity();
        clube.setNome(clubeRq.getNome());
        clube.setQtd_titulos_nacionais(clubeRq.getQtd_titulos_nacionais());
        clube.setQtd_titulos_internacionais(clubeRq.getQtd_titulos_internacionais());
        clube.setNome_treinador(clubeRq.getNome_treinador());

        try{
            clubeRepository.save(clube);
        }catch (Exception e){
            System.out.println("Erro ao inserir clube!");
        }
    }

    @GetMapping("/{id}")
    public ClubeRs busca_clube_por_id(@PathVariable("id") Long id){
        var clube = clubeRepository.getOne(id);
        return ClubeRs.converter(clube);

    }
}
