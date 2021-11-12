package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.CurrentProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<CurrentProject, Integer> {

    CurrentProject findByNameOfProject(String nameOfProject);
}
