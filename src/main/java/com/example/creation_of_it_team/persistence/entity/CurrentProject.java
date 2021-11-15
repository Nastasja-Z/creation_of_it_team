package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "projects")
public class CurrentProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "project_name", nullable = false)
    private String nameOfProject;

    @OneToMany(mappedBy = "currentProject")
    private Set<ProjectIndicator> projectIndicatorSet;

    @Column(nullable = false)
    private Integer budget;

    @Column(name = "start_project", nullable = false)
    private Date startOfProject;

    @Column(name = "end_project") // nullable??
    private Date endOfProject;    // validate!!!

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public Set<ProjectIndicator> getProjectIndicatorSet() {
        return projectIndicatorSet;
    }

    public void setProjectIndicatorSet(Set<ProjectIndicator> projectIndicatorSet) {
        this.projectIndicatorSet = projectIndicatorSet;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Date getStartOfProject() {
        return startOfProject;
    }

    public void setStartOfProject(Date startOfProject) {
        this.startOfProject = startOfProject;
    }

    public Date getEndOfProject() {
        return endOfProject;
    }

    public void setEndOfProject(Date endOfProject) {
        this.endOfProject = endOfProject;
    }
}
