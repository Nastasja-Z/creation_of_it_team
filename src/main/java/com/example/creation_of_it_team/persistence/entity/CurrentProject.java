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
    private Integer projectId;

    @Column(name = "project_name", nullable = false)
    private String nameOfProject;

    @OneToMany(mappedBy = "projects")
    private Set<Indicator> indicators;

    @Column(nullable = false)
    private Integer budget;

    @Column(name = "start_project", nullable = false)
    private Date startOfProject;

    @Column(name = "end_project") // nullable??
    private Date endOfProject;    // validate!!!





}
