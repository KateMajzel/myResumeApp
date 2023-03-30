package com.example.myresume.service;

import com.example.myresume.model.EducationModel;
import com.example.myresume.repository.EducationRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EducationService {
    private final EducationRepository repo;

    public EducationService(EducationRepository repo) {
        this.repo = repo;

    }

    public List<EducationModel> getEducationList() {
        return repo.findAll();
    }

    public void addEducation(EducationModel educationModel) {
        repo.save(educationModel);
    }

    public void addNewEducation(EducationModel educationModel) {
        repo.save(educationModel);
    }

    public EducationModel getEducationById(Long id) {
        Optional<EducationModel> education = repo.findById(id);
        if (education.isPresent()) {
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }

    public void removeEducation(Long id) {
        repo.deleteById(id);
    }

    public void saveEditEducation(EducationModel educationModel) {
        repo.save(educationModel);
    }
}
