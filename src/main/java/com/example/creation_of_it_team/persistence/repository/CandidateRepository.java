package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.Candidate;
import com.example.creation_of_it_team.persistence.entity.Competence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    Candidate findByNameOfCandidate(String nameOfCandidate);
}
