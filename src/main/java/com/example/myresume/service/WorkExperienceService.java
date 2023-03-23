package com.example.myresume.service;

import com.example.myresume.model.WorkExperienceModel;
import com.example.myresume.repository.WorkExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkExperienceService {
    private final WorkExperienceRepository repo;

    public WorkExperienceService(WorkExperienceRepository repo) {
        this.repo = repo;
    }

    public List<WorkExperienceModel> getExperienceList() {
        return repo.findAll();
    }

    public void addExperience(WorkExperienceModel workExperienceModel) {
        repo.save(workExperienceModel);
    }

    public WorkExperienceModel getWorkExperienceById(Long id) {
        Optional<WorkExperienceModel> workExperience = repo.findById(id);
        if (workExperience.isPresent()) {
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }

    public void removeWorkExperience(Long id) {
        repo.deleteById(id);
    }

    public void saveEditWorkExperience(WorkExperienceModel workExperienceModel) {
        repo.save(workExperienceModel);
    }

}
