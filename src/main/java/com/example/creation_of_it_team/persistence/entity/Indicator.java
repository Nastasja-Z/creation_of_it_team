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

    @OneToMany(mappedBy = "indicator")
    private Set<ProjectIndicator> projectIndicatorSet;

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

    public Set<ProjectIndicator> getProjectIndicatorSet() {
        return projectIndicatorSet;
    }

    public void setProjectIndicatorSet(Set<ProjectIndicator> projectIndicatorSet) {
        this.projectIndicatorSet = projectIndicatorSet;
    }
}
