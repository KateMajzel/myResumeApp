package com.example.myresume.controller;

import com.example.myresume.model.ContactModel;
import com.example.myresume.model.EducationModel;
import com.example.myresume.model.WorkExperienceModel;
import com.example.myresume.service.ContactService;
import com.example.myresume.service.EducationService;
import com.example.myresume.service.WorkExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {

    private final WorkExperienceService workExperienceService;
    private final EducationService educationService;


    public HomeController(WorkExperienceService workExperienceService, EducationService educationService) {
        this.workExperienceService = workExperienceService;
        this.educationService = educationService;
    }

    @GetMapping("/")
    public String getHome(Model model) {
        List<WorkExperienceModel> experienceList = workExperienceService.getExperienceList();
        model.addAttribute("workExperienceModel", experienceList);
        List<EducationModel> educationList = educationService.getEducationList();
        model.addAttribute("educationModel", educationList);
        return "index";
    }

}

