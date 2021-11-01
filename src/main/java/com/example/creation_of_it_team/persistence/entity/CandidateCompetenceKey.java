package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CandidateCompetenceKey  implements Serializable {

    @Column(name = "candidate_id")
    private Long candidateId;

    @Column(name = "competence_id")
    private Long competenceId;

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public Long getCompetenceId() {
        return competenceId;
    }

    public void setCompetenceId(Long competenceId) {
        this.competenceId = competenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateCompetenceKey that = (CandidateCompetenceKey) o;
        return Objects.equals(candidateId, that.candidateId) && Objects.equals(competenceId, that.competenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidateId, competenceId);
    }
}
