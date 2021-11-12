package com.example.creation_of_it_team.persistence.entity;

import javax.naming.Name;
import javax.persistence.*;

@Entity
public class ProjectIndicator {

    @EmbeddedId
    private ProjectIndicatorKey id;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    private CurrentProject currentProject;

    @ManyToOne
    @MapsId("indicatorId")
    @JoinColumn(name = "indicator_id")
    private Indicator indicator;

    private Integer level;

    public ProjectIndicatorKey getId() {
        return id;
    }

    public void setId(ProjectIndicatorKey id) {
        this.id = id;
    }

    public CurrentProject getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(CurrentProject currentProject) {
        this.currentProject = currentProject;
    }

    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
