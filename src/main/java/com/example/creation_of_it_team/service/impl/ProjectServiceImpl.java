package com.example.creation_of_it_team.service.impl;

import com.example.creation_of_it_team.persistence.entity.CurrentProject;
import com.example.creation_of_it_team.persistence.repository.ProjectRepository;
import com.example.creation_of_it_team.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void create(CurrentProject currentProject) {
        projectRepository.save(currentProject);
    }

    @Override
    public void update(CurrentProject currentProject) {
        projectRepository.save(currentProject);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public CurrentProject findById(Long id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public Collection<CurrentProject> findAll() {
        return projectRepository.findAll();
    }

    /*public CurrentProject findByNameOfProject(String name) {
        return projectRepository.findByNameOfProject(name);
    }*/
}
