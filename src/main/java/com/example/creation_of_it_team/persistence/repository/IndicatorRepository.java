package com.example.creation_of_it_team.persistence.repository;

import com.example.creation_of_it_team.persistence.entity.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndicatorRepository extends JpaRepository<Indicator, Long> {

    Indicator findByIndicatorName(String indicatorName);
}
