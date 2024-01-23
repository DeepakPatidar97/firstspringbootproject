package com.example.firstspringbootproject.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstspringbootproject.model.Contact;
import com.example.firstspringbootproject.repositary.ContactRepositary;

import jakarta.validation.Valid;


@Service
public class ContactServices {

	@Autowired
	public ContactRepositary contactRepositary;
	
	public List<Contact> findByUsername(String username){
		return contactRepositary.findByUsername(username);
	}
	
	public void addContact(Contact contact){
		System.out.println(contact);
		contactRepositary.save(contact);
	}

	public void deleteById(Long id) {
		contactRepositary.deleteById(id);
	}

	public Optional<Contact> findById(Long id) {
		return contactRepositary.findById(id);
	}

	public void updateContact(@Valid Contact contact) {
		deleteById(contact.getId());
		contactRepositary.save(contact);		
	}
}
