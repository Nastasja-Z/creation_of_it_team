package com.example.creation_of_it_team.service.impl;


import com.example.creation_of_it_team.persistence.entity.Competence;
import com.example.creation_of_it_team.persistence.repository.CandidateRepository;
import com.example.creation_of_it_team.persistence.repository.CompetenceRepository;
import com.example.creation_of_it_team.service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CompetenceServiceImpl implements CompetenceService {

    @Autowired
    private CompetenceRepository competenceRepository;

    @Autowired
    private CandidateRepository candidateRepository;

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

    @Override
    public Collection<Competence> findAllByCandidateId(Long candidateId) {
        return competenceRepository.findAllByCandidateId(candidateId);
    }

}
