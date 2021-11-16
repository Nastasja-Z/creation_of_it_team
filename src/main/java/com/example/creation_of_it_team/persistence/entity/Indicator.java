package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "indicators")
public class Indicator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "indicator_id")
    private Long indicatorId;

    @Column(name = "indicator_name")
    private String indicatorName;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private CurrentProject project;

    private Integer level;

    public CurrentProject getProject() {
        return project;
    }

    public void setProject(CurrentProject project) {
        this.project = project;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

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
}
