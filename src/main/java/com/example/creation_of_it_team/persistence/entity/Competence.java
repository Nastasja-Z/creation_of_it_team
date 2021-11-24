package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "competences")
public class Competence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "competence_id")
    private Long competenceId;

    @Column(name = "competence_name", nullable = false)
    private String competenceName;

    @ManyToOne
    @JoinColumn(name="candidate_id", nullable = false)
    private Candidate candidate;

    private Integer level;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Long getCandidateId() {
        return this.candidate == null ? null : this.candidate.getCandidateId();
    }

    public void setCandidateId(Long candidateId) {
        if (this.candidate == null) {
            this.setCandidate(new Candidate());
        }
        this.getCandidate().setCandidateId(candidateId);
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Competence that = (Competence) o;
        return Objects.equals(competenceId, that.competenceId) && Objects.equals(competenceName, that.competenceName) && Objects.equals(candidate, that.candidate) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competenceId, competenceName, candidate, level);
    }
}
