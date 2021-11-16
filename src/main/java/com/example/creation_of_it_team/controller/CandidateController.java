package com.example.creation_of_it_team.controller;

import com.example.creation_of_it_team.persistence.entity.Candidate;
import com.example.creation_of_it_team.persistence.entity.Competence;
import com.example.creation_of_it_team.service.CandidateService;
import com.example.creation_of_it_team.service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private CompetenceService competenceService;


    @GetMapping
    public String findAll(Model model) {
        Collection<Candidate> candidates = candidateService.findAll();
        model.addAttribute("candidates", candidates);
        return "candidates/candidates_all";
    }

    @GetMapping("/all_competences")
    public String getFullInfoAboutCandidate(Model model) {
        model.addAttribute("competences", competenceService.findAll());
        return "all_competences";
    }

    @GetMapping("/getCandidateDetails/{candidateId}")
    public String getCandidateDetails(Model model, @PathVariable("candidateId") Long candidateId) {
        model.addAttribute("candidate", candidateService.findById(candidateId));
        return "candidateDetails";
    }

    @GetMapping("/new")
    public String redirectToNewCandidate(Model model) {
        model.addAttribute("candidate", new Candidate());
        return "candidates/candidates_new";
    }

    @PostMapping("/new")
    public String createCandidate(@ModelAttribute("candidate")Candidate candidate) {
        candidateService.create(candidate);
        return "redirect:/candidates";
    }

    // COMPETENCE

    @GetMapping("/delete/{id}")
    public String deleteCompetence(@PathVariable Long id) {
        competenceService.delete(id);
        return "redirect:/candidates";
    }

    @PostMapping("/new_competence")
    public String createCompetence(@ModelAttribute("competence") Competence competence) {
        competenceService.create(competence);
        return "redirect:/candidates";  // another redirect
    }

}
