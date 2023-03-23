package com.example.myresume.model;

import javax.persistence.*;

@Entity
public class ContactModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_sender")
    private String nameSender;
    @Column(name = "email")
    private String email;
    @Column(name = "subject")
    private String subject;
    @Column(name = "message")
    private String message;

    public ContactModel() {
    }

    public ContactModel(Long id, String nameSender, String email, String subject, String message) {
        this.id = id;
        this.nameSender = nameSender;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSender() {
        return nameSender;
    }

    public void setNameSender(String nameSender) {
        this.nameSender = nameSender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
