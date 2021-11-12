package com.example.creation_of_it_team.persistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private Long candidateId;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateCompetence> candidateCompetenceSet;

    private String nameOfCandidate;

    private String surnameOfCandidate;

    private Float salaryProHour;

    private Integer employment; // ограничение часов в сутках или ??

    public Long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    public Set<CandidateCompetence> getCandidateCompetenceSet() {
        return candidateCompetenceSet;
    }

    public void setCandidateCompetenceSet(Set<CandidateCompetence> candidateCompetenceSet) {
        this.candidateCompetenceSet = candidateCompetenceSet;
    }

    public String getNameOfCandidate() {
        return nameOfCandidate;
    }

    public void setNameOfCandidate(String nameOfCandidate) {
        this.nameOfCandidate = nameOfCandidate;
    }

    public String getSurnameOfCandidate() {
        return surnameOfCandidate;
    }

    public void setSurnameOfCandidate(String surnameOfCandidate) {
        this.surnameOfCandidate = surnameOfCandidate;
    }

    public Float getSalaryProHour() {
        return salaryProHour;
    }

    public void setSalaryProHour(Float salaryProHour) {
        this.salaryProHour = salaryProHour;
    }

    public Integer getEmployment() {
        return employment;
    }

    public void setEmployment(Integer employment) {
        this.employment = employment;
    }
}
