package com.clubes.apiclubes.repository;

import com.clubes.apiclubes.entity.ClubeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubeRepository extends JpaRepository<ClubeEntity, Long> {

}
