package com.example.myresume.repository;

import com.example.myresume.model.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<ContactModel, Long> {

}
