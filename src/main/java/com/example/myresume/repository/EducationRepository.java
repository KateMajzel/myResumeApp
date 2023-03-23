package com.example.myresume.repository;

import com.example.myresume.model.EducationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<EducationModel, Long> {
}
