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

    @GetMapping("/allCompetences")
    public String getFullInfoAboutCandidate(Model model) {
        Collection<Candidate> candidates=candidateService.findAll();
        Collection<Competence> competences=competenceService.findAll();
        model.addAttribute("competences", competences);
        model.addAttribute("candidates", candidates);
        return "all_competences";
    }

    @GetMapping("/getCandidateDetails/{candidateId}")
    public String getCandidateDetails(Model model, @PathVariable("candidateId") Long candidateId) {
        model.addAttribute("candidate", candidateService.findById(candidateId));
        model.addAttribute("competences", competenceService.findAllByCandidateId(candidateId));
        return "candidates/candidate_details";
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

    // when you will use this func, try to feel all input text fields, so they contains prev. values
    // so user don`t need to change all of fields (the same with other updateflows)
    @PostMapping("/update")
    public String updateCandidate(@ModelAttribute("candidate") Candidate candidate) {
        candidateService.update(candidate);
        return "redirect:/candidates";
    }

    @GetMapping("/delete/{id}")
    public String deleteCandidate(@PathVariable Long id) {
        candidateService.delete(id);
        return "redirect:/candidates";
    }

    // COMPETENCE

    @GetMapping("/deleteCompetence/{id}")
    public String deleteCompetence(@PathVariable Long id) {
        competenceService.delete(id);
        return "redirect:/candidates";
    }

    @PostMapping("/newCompetence")
    public String createCompetence(@ModelAttribute("competence") Competence competence, @ModelAttribute("candidate") Candidate candidate) {
        competence.setCandidate(candidate);
        competenceService.create(competence);
        return "redirect:/candidates";  // another redirect
    }

    @RequestMapping(value = "/newCompetence", method = RequestMethod.GET)
    public String displayCompetence(Model model) {
        model.addAttribute("competence", new Competence());
        Collection<Candidate> candidates = candidateService.findAll();
        model.addAttribute("candidates", candidates);
        return "candidates/competence_new";
    }

    @PostMapping("/updateCompetence")
    public String updateCompetence(@ModelAttribute("competence") Competence competence) {
        competenceService.update(competence);
        return "redirect:/candidates";
    }

}
