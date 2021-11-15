package com.example.creation_of_it_team.service.impl;

import com.example.creation_of_it_team.persistence.entity.Candidate;
import com.example.creation_of_it_team.persistence.entity.Competence;
import com.example.creation_of_it_team.persistence.repository.CandidateRepository;
import com.example.creation_of_it_team.service.CandidateService;

import java.util.Collection;
import java.util.Set;

public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public void create(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    @Override
    public void update(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    @Override
    public void delete(Long id) {
        candidateRepository.deleteById(id);
    }

    @Override
    public Candidate findById(Long id) {
        return candidateRepository.findById(id).get();
    }

    @Override
    public Collection<Candidate> findAll() {
        return candidateRepository.findAll();
    }
}
