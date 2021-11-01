package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="competences")
public class Competence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "competence_id")
    private Long competenceId;

    @Column(name = "competence_name", nullable = false)
    private String competenceName;

    @OneToMany(mappedBy = "competences")
    private Set<Candidate> candidates;

    public Long getCompetenceId() {
        return competenceId;
    }

    public void setCompetenceId(Long competenceId) {
        this.competenceId = competenceId;
    }

    public String getCompetenceName() {
        return competenceName;
    }

    public void setCompetenceName(String competenceName) {
        this.competenceName = competenceName;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }
}
