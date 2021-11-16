package com.example.creation_of_it_team.service.impl;

import com.example.creation_of_it_team.persistence.entity.CurrentProject;
import com.example.creation_of_it_team.persistence.entity.Indicator;
import com.example.creation_of_it_team.persistence.repository.IndicatorRepository;
import com.example.creation_of_it_team.service.IndicatorService;
import groovy.transform.AutoImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class IndicatorServiceImpl implements IndicatorService {

    @Autowired
    private IndicatorRepository indicatorRepository;

    @Override
    public void create(Indicator indicator) {
        indicatorRepository.save(indicator);
    }

    @Override
    public void update(Indicator indicator) {
        indicatorRepository.save(indicator);
    }

    @Override
    public void delete(Long id) {
        indicatorRepository.deleteById(id);
    }

    @Override
    public Indicator findById(Long id) {
        return indicatorRepository.findById(id).get();
    }

    @Override
    public Collection<Indicator> findAll() {
        return indicatorRepository.findAll();
    }

    public Iterable<Indicator> findAllByCurrentProject(CurrentProject project) {
        return indicatorRepository.findAllByProject(project);
    }
}
