package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProjectIndicatorKey implements Serializable {

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "indicator_id")
    private Long indicatorId;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Long indicatorId) {
        this.indicatorId = indicatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectIndicatorKey that = (ProjectIndicatorKey) o;
        return Objects.equals(projectId, that.projectId) && Objects.equals(indicatorId, that.indicatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, indicatorId);
    }
}
