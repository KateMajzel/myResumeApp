package com.example.myresume.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EducationModel {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@DateTimeFormat(pattern = "yyyy-MM")
@Column(name="start_education_date")
    private Date startEducationDate;
@DateTimeFormat(pattern = "yyyy-MM")
@Column(name="finish_education_date")
    private Date finishEducationDate;
@Column(name="school_name")
    private String schoolName;
@Column(name="direction_name")
    private String directionName;
@Column(name="information_of_education")
    private String informationOfeducation;

    public EducationModel() {
    }

    public EducationModel(Long id, Date startEducationDate, Date finishEducationDate, String schoolName, String directionName, String informationOfeducation) {
        this.id = id;
        this.startEducationDate = startEducationDate;
        this.finishEducationDate = finishEducationDate;
        this.schoolName = schoolName;
        this.directionName = directionName;
        this.informationOfeducation = informationOfeducation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartEducationDate() {
        return startEducationDate;
    }

    public void setStartEducationDate(Date startEducationDate) {
        this.startEducationDate = startEducationDate;
    }

    public Date getFinishEducationDate() {
        return finishEducationDate;
    }

    public void setFinishEducationDate(Date finishEducationDate) {
        this.finishEducationDate = finishEducationDate;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public String getInformationOfeducation() {
        return informationOfeducation;
    }

    public void setInformationOfeducation(String informationOfeducation) {
        this.informationOfeducation = informationOfeducation;
    }
}
