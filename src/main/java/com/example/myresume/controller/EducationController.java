package com.example.myresume.controller;

import com.example.myresume.model.EducationModel;
import com.example.myresume.service.EducationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/educations")
    public String getAddEducation(Model model) {
        List<EducationModel> educationList = educationService.getEducationList();
        model.addAttribute("educationModel", educationList);
        return "competence/educations";
    }

    @PostMapping("/addEducations")
    public RedirectView postEducation(EducationModel educationModel) {
        educationService.addEducation(educationModel);
        return new RedirectView("educations");
    }

    @GetMapping("/editEducations/{id}")
    public String getEducationById(@PathVariable("id") Long id, Model model) {
        EducationModel educationModel = educationService.getEducationById(id);
        model.addAttribute("education", educationModel);
        return "competence/editEducations";
    }

    @PostMapping("/educations/{id}")
    public RedirectView removeEducation(@PathVariable("id") Long id) {
        educationService.removeEducation(id);
        return new RedirectView("/educations");
    }

    @PostMapping("/editEducations/{id}")
    public RedirectView postEditEducation(@PathVariable("id") Long id, EducationModel editEducationModel) {
        educationService.saveEditEducation(editEducationModel);
        return new RedirectView("/educations");
    }

}
