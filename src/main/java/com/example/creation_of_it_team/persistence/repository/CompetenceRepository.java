package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface CompetenceRepository extends JpaRepository<Competence, Long> {

    @Query("FROM Competence p WHERE p.candidate.candidateId = :candidateId ORDER BY p.competenceName")
    Collection<Competence> findAllByCandidateId(@Param("candidateId") Long candidateId);

}
