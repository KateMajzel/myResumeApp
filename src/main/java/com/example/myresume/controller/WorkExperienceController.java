package com.example.myresume.controller;

import com.example.myresume.model.WorkExperienceModel;
import com.example.myresume.service.WorkExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class WorkExperienceController {
    private final WorkExperienceService workExperienceService;

    public WorkExperienceController(WorkExperienceService workExperienceService) {
        this.workExperienceService = workExperienceService;
    }

    @GetMapping("/workExperiences")
    public String getAddExperience(Model model) {
        List<WorkExperienceModel> experienceList = workExperienceService.getExperienceList();
        model.addAttribute("workExperienceModel", experienceList);
        return "competence/workExperiences";
    }

    @PostMapping("/addExperiences")
    public RedirectView postWorkExperience(WorkExperienceModel workExperienceModel) {
        workExperienceService.addExperience(workExperienceModel);
        return new RedirectView("workExperiences");
    }

    @GetMapping("/editWorkExperiences/{id}")
    public String getWorkExperienceById(@PathVariable("id") Long id, Model model) {
        WorkExperienceModel workExperienceModel = workExperienceService.getWorkExperienceById(id);
        model.addAttribute("workExperience", workExperienceModel);
        return "competence/editWorkExperiences";
    }

    @PostMapping("/workExperiences/{id}")
    public RedirectView removeWorkExperience(@PathVariable("id") Long id) {
        workExperienceService.removeWorkExperience(id);
        return new RedirectView("/workExperiences");
    }

    @PostMapping("/editWorkExperiences/{id}")
    public RedirectView postEditWorkExperience(@PathVariable("id") Long id, WorkExperienceModel editWorkExperienceModel) {
        workExperienceService.saveEditWorkExperience(editWorkExperienceModel);
        return new RedirectView("/workExperiences");
    }
}