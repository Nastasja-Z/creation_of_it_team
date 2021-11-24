package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.CurrentProject;
import com.example.creation_of_it_team.persistence.entity.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndicatorRepository extends JpaRepository<Indicator, Long> {

    Iterable<Indicator> findAllByProject(CurrentProject currentProject);
}
