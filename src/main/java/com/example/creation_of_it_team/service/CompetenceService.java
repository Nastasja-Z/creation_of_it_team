package com.example.creation_of_it_team.service;

import com.example.creation_of_it_team.persistence.entity.Candidate;
import com.example.creation_of_it_team.persistence.entity.Competence;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface CompetenceService extends BaseService<Competence>{

    Collection<Competence> findAllByCandidateId(Long candidateId);
}
