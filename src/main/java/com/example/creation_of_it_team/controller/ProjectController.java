package com.example.creation_of_it_team.controller;

import com.example.creation_of_it_team.persistence.entity.CurrentProject;
import com.example.creation_of_it_team.persistence.entity.Indicator;
import com.example.creation_of_it_team.service.IndicatorService;
import com.example.creation_of_it_team.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private IndicatorService indicatorService;

    @GetMapping
    public String findAll(Model model) {
        Collection<CurrentProject> projects = projectService.findAll();
        model.addAttribute("projects", projects);
        return "projects/projects_all";
    }

    @GetMapping("/new")
    public String redirectToNewProject(Model model) {
        model.addAttribute("project", new CurrentProject());
        return "projects/projects_new";
    }

    @GetMapping("/all_indicators")
    public String getFullInfoAboutProject(Model model) {
        model.addAttribute("indicators", indicatorService.findAll());
        return "all_indicators";
    }

    @GetMapping("/getProjectDetails/{projectId}")
    public String getProjectDetails(Model model, @PathVariable("projectId") Long projectId) {
        model.addAttribute("project", projectService.findById(projectId));
        return "projectDetails";
    }

    @PostMapping("/new")
    public String createProject(@ModelAttribute("project") CurrentProject project) {
        projectService.create(project);
        return "redirect:/projects";
    }

    @PostMapping("/update")
    public String updateProject(@ModelAttribute("project") CurrentProject project) {
        projectService.update(project);
        return "redirect:/projects";
    }

    // INDICATORS

    @GetMapping("/delete/{id}")
    public String deleteIndicator(@PathVariable Long id) {
        indicatorService.delete(id);
        return "redirect:/projects";
    }

    @PostMapping("/new_indicator")
    public String createIndicator(@ModelAttribute("indicator") Indicator indicator) {
        indicatorService.create(indicator);
        return "redirect:/projects";  // another redirect
    }

    @PostMapping("/update_indicator")
    public String updateIndicator(@ModelAttribute("indicator") Indicator indicator) {
        indicatorService.update(indicator);
        return "redirect:/projects";
    }
}
