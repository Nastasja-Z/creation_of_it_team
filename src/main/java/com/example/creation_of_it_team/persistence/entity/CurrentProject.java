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

    @Column(name = "project_name")
    private String nameOfProject;

    @OneToMany(mappedBy = "project")
    private Set<Indicator> indicators;

    @Column(nullable = false)
    private Integer budget;

    @Column(name = "start_project")
    private Date startOfProject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "end_project") // nullable??
    private Date endOfProject;    // validate!!!

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public Set<Indicator> getIndicators() {
        return indicators;
    }

    public void setIndicators(Set<Indicator> indicators) {
        this.indicators = indicators;
    }
}
