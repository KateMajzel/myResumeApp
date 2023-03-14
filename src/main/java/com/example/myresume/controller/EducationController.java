package com.example.myresume.controller;

import com.example.myresume.model.EducationModel;
import com.example.myresume.service.EducationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping(EducationController.CV_BASE_PATH)
public class EducationController {

    static final String CV_BASE_PATH = "/educations";
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }
 @GetMapping
 public String getAddEducation(Model model) {
     List<EducationModel> educationList = educationService.getEducationList();
     model.addAttribute("educationModel", educationList);
        return "competence/education";
 }

    @PostMapping("/addEducations")
    public RedirectView postEducation(EducationModel educationModel){
        educationService.addEducation(educationModel);
        return new RedirectView("education");
    }

    @GetMapping ("/editEducations/{id}")
    public String getEducationById (@PathVariable("id")Long id, Model model){
        EducationModel educationModel = educationService.getEducationById(id);
        model.addAttribute("education", educationModel);
        return "competence/editEducation";
    }

    @PostMapping("/educations/{id}")
    public RedirectView removeEducation (@PathVariable("id") Long id){
        educationService.removeEducation(id);
        return new RedirectView("/education");
    }

    @PostMapping("/editEducations/{id}")
    public RedirectView postEditEducation (@PathVariable("id") Long id, EducationModel editEducationModel) {
        educationService.saveEditEducation(editEducationModel);
        return new RedirectView("/education");
    }

}
