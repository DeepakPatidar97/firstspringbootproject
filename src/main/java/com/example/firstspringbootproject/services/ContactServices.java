package com.example.firstspringbootproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
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
	
	public void addContact(@NonNull Contact contact){
		System.out.println(contact);
		contactRepositary.save(contact);
	}

	public void deleteById(Long id) {
		contactRepositary.deleteById(id);
	}

	public Optional<Contact> findById(Long id) {
		return contactRepositary.findById(id);
	}

	public void updateContact(@Valid @NonNull Contact contact) {
		contactRepositary.save(contact);		
	}
}
