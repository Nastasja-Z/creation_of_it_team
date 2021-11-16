package com.example.creation_of_it_team.service.impl;

import com.example.creation_of_it_team.persistence.entity.Candidate;
import com.example.creation_of_it_team.persistence.entity.Competence;
import com.example.creation_of_it_team.persistence.repository.CandidateRepository;
import com.example.creation_of_it_team.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

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
