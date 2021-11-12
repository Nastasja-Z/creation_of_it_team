package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

    Candidate findByNameOfCandidate(String nameOfCandidate);
}
