package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.*;

@Entity
public class CandidateCompetence {

    @EmbeddedId
    private CandidateCompetenceKey id;

    @ManyToOne
    @MapsId("candidateId")
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @ManyToOne
    @MapsId("competenceId")
    @JoinColumn(name = "competence_id")
    private Competence competence;

    private Integer level;

    public CandidateCompetenceKey getId() {
        return id;
    }

    public void setId(CandidateCompetenceKey id) {
        this.id = id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Competence getCompetence() {
        return competence;
    }

    public void setCompetence(Competence competence) {
        this.competence = competence;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
