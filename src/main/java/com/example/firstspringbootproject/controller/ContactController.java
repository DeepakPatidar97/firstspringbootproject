package com.example.firstspringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.firstspringbootproject.services.ContactServices;

@Controller
@SessionAttributes("username")
public class ContactController {
	
	@Autowired
	public ContactServices contactServices;

	@RequestMapping("/list-contacts")
	public String listAllContact(ModelMap map) {
		map.put("contacts", contactServices.getAllContacts());
		return "listcontact";
	}
	
	@RequestMapping("/add-contacts")
	public String addContact(ModelMap map) {
		map.put("contact", contactServices.getAllContacts());
		return "listcontact";
	}
}
