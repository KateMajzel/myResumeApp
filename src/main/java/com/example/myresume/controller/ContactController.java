package com.example.myresume.controller;

import com.example.myresume.model.ContactModel;
import com.example.myresume.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String getAddContact() {
        return "communication/contact";
    }

    @PostMapping("/contact")
    public RedirectView postAddMessage(ContactModel contactModel) {
        contactService.addMessage(contactModel);
        return new RedirectView("thanks");
    }

}
