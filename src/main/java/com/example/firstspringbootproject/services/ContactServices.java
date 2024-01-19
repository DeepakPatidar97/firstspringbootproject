package com.example.firstspringbootproject.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.firstspringbootproject.model.Contact;


@Service
public class ContactServices {
	
	public static List<Contact> contacts = new ArrayList<>();
	
	public static int count = 0;
	
	static {
		contacts.add(new Contact(++count, "Deepak Patidar", "8109240892", LocalDate.now().plusYears(1)));
		contacts.add(new Contact(++count, "Priya Patidar", "9165758221", LocalDate.now().plusYears(1)));
		contacts.add(new Contact(++count, "Pooja Patidar", "7987925004", LocalDate.now().plusYears(1)));
		contacts.add(new Contact(++count, "Narmada Patidar", "9926048922", LocalDate.now().plusYears(1)));
	}
	
	public List<Contact> getAllContacts(){
		return contacts;
	}
	
	public void addContact(Contact contact){
		contacts.add(contact);
	}
}
