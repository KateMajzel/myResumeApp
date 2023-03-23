package com.example.myresume.service;

import com.example.myresume.model.ContactModel;
import com.example.myresume.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public void addMessage(ContactModel contactModel) {
        repo.save(contactModel);
    }
}
