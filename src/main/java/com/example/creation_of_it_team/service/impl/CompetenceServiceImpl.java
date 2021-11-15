package com.example.creation_of_it_team.service.impl;

import com.example.creation_of_it_team.persistence.entity.Candidate;
import com.example.creation_of_it_team.persistence.entity.Competence;
import com.example.creation_of_it_team.persistence.repository.CompetenceRepository;
import com.example.creation_of_it_team.service.CompetenceService;

import java.util.Collection;
import java.util.Set;

public class CompetenceServiceImpl implements CompetenceService {

    private final CompetenceRepository competenceRepository;

    public CompetenceServiceImpl(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    @Override
    public void create(Competence competence) {
        competenceRepository.save(competence);
    }

    @Override
    public void update(Competence competence) {
        competenceRepository.save(competence);
    }

    @Override
    public void delete(Long id) {
        competenceRepository.deleteById(id);
    }

    @Override
    public Competence findById(Long id) {
        return competenceRepository.findById(id).get();
    }

    @Override
    public Collection<Competence> findAll() {
        return competenceRepository.findAll();
    }

    /*public Set<Competence> getAllCompetencesByCandidate(Candidate candidate) {
        return competenceRepository.findAllByCandidateOrderByLevel(candidate);
    }*/

}
