package com.example.myresume.repository;

import com.example.myresume.model.WorkExperienceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkExperienceRepository extends JpaRepository<WorkExperienceModel, Long> {
}
