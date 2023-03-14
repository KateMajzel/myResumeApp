package com.example.myresume.controller;

import com.example.myresume.model.WorkExperienceModel;
import com.example.myresume.service.WorkExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping(WorkExperienceController.CV_PATH)
public class WorkExperienceController {

    static final String CV_PATH = "workExperiences";
    private final WorkExperienceService workExperienceService;

    public WorkExperienceController(WorkExperienceService workExperienceService) {
        this.workExperienceService = workExperienceService;
    }

//pobieranie doświadczenia z bazy na stronę
    @GetMapping
    public String getAddExperience(Model model) {
    List<WorkExperienceModel> experienceList = workExperienceService.getExperienceList();
        model.addAttribute("workExperienceModel", experienceList);
        return "competence/workExperience";

    }
//pobieranie ze strony doświadczenia i dodawanie do bazy
    @PostMapping("/addExperiences")
    public RedirectView postWorkExperience(WorkExperienceModel workExperienceModel) {
        workExperienceService.addExperience(workExperienceModel);
        return new RedirectView("workExperience");
    }
//edycja doświadczenia po id
    @GetMapping("/editWorkExperiences/{id}")
    public String getWorkExperienceById(@PathVariable("id") Long id, Model model) {
      WorkExperienceModel workExperienceModel = workExperienceService.getWorkExperienceById(id);
        model.addAttribute("workExperience", workExperienceModel);
        return "competence/editWorkExperience";
    }
//usuniecie obecnego doświadczenia
    @PostMapping ("/workExperiences/{id}")
    public RedirectView removeWorkExperience(@PathVariable("id") Long id) {
        workExperienceService.removeWorkExperience(id);
        return new RedirectView("/workExperience");
    }
//zapisywanie edytowanego doświadczenia
    @PostMapping("/editWorkExperiences/{id}")
    public RedirectView postEditWorkExperience(@PathVariable("id") Long id, WorkExperienceModel editWorkExperienceModel) {
        workExperienceService.saveEditWorkExperience(editWorkExperienceModel);
        return new RedirectView("/workExperience");
    }


}
