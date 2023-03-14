package com.example.myresume.service;

import com.example.myresume.model.WorkExperienceModel;
import com.example.myresume.repository.WorkExperienceRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class WorkExperienceService {
    private final WorkExperienceRepository repo;

    public WorkExperienceService(WorkExperienceRepository repo) {
        this.repo = repo;
    }

//pobieranie doświadczenia z bazy
    public List<WorkExperienceModel> getExperienceList() {
        return repo.findAll();
    }
//dodawanie doświadczenia do bazy
    public void addExperience(WorkExperienceModel workExperienceModel) {
        repo.save(workExperienceModel);
    }
//edycja doświadczenia po id
    public WorkExperienceModel getWorkExperienceById(Long id) {
        Optional<WorkExperienceModel> workExperience = repo.findById(id);
        if (workExperience.isPresent()){
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }

//usuniecie doświadczenia po id
    public void removeWorkExperience (Long id) {
        repo.deleteById(id);
    }

//zapisanie doświadczenia
    public void saveEditWorkExperience(WorkExperienceModel workExperienceModel){
        repo.save(workExperienceModel);
    }

}
