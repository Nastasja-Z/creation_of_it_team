package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "indicators")
public class Indicator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "indicator_id")
    private Long indicatorId;

    @Column(name = "indicator_name", nullable = false)
    private String indicatorName;

    @OneToMany(mappedBy = "indicators")
    private Set<CurrentProject> currentProjects;

    public Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
    }

    public Set<CurrentProject> getCurrentProjects() {
        return currentProjects;
    }

    public void setCurrentProjects(Set<CurrentProject> currentProjects) {
        this.currentProjects = currentProjects;
    }
}
