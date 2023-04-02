package com.example.myresume.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
public class WorkExperienceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM")
    @Column(name = "finish_work")
    private Date finishWork;
    @DateTimeFormat(pattern = "yyyy-MM")
    @Column(name = "start_work")
    private Date startWork;
    @Column(name = "company_name")
    private String companeName;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "experience")
    private String experience;

    public WorkExperienceModel() {
    }

    public WorkExperienceModel(Long id, Date startWork, Date finishWork, String companeName, String jobTitle, String experience) {
        this.id = id;
        this.startWork = startWork;
        this.finishWork = finishWork;
        this.companeName = companeName;
        this.jobTitle = jobTitle;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartWork() {
        return startWork;
    }

    public void setStartWork(Date startWork) {
        this.startWork = startWork;
    }

    public Date getFinishWork() {
        return finishWork;
    }

    public void setFinishWork(Date finishWork) {
        this.finishWork = finishWork;
    }

    public String getCompaneName() {
        return companeName;
    }

    public void setCompaneName(String companeName) {
        this.companeName = companeName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
