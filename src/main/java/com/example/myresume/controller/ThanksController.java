package com.example.myresume.controller;

import com.example.myresume.model.EducationModel;
import com.example.myresume.model.WorkExperienceModel;
import com.example.myresume.service.EducationService;
import com.example.myresume.service.WorkExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ThanksController {
    private final WorkExperienceService workExperienceService;
    private final EducationService educationService;

    public ThanksController(WorkExperienceService workExperienceService, EducationService educationService) {
        this.workExperienceService = workExperienceService;
        this.educationService = educationService;
    }

    @GetMapping("/thanks")
    public String thanks(Model model) {
        List<WorkExperienceModel> experienceList = workExperienceService.getExperienceList();
        model.addAttribute("workExperienceModel", experienceList);
        List<EducationModel> educationList = educationService.getEducationList();
        model.addAttribute("educationModel", educationList);

        return "communication/thanks";
    }
}

