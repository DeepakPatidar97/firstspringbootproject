package com.example.firstspringbootproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.firstspringbootproject.model.Contact;
import com.example.firstspringbootproject.repositary.ContactRepositary;
import com.example.firstspringbootproject.services.ContactServices;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("username")
public class ContactControllerJPA {
	
	@Autowired
	public ContactServices contactServices;

	@GetMapping("/list-contacts")
	public String listAllContact(ModelMap map) {
		map.put("contacts", contactServices.findByUsername(getUsername(map)));
		return "listcontact";
	}
	
	private String getUsername(ModelMap map) {
		return (String)map.get("username");
	}
	
	@GetMapping("/add-contacts")
	public String addContactPage(ModelMap map) {
		Contact contact = new Contact(null,null,null,getUsername(map));
		map.put("contact", contact);
		return "addContact";
	}
	
	@PostMapping("/add-contacts")
	public String addContact(@ModelAttribute("contact") @Valid Contact contact, BindingResult bindingResult, ModelMap map) {
		if(bindingResult.hasErrors()) {
			return "addContact";
		}
		contactServices.addContact(contact);
		return "redirect:list-contacts";
	}
	
	@GetMapping("/delete-contact")
	public String deleteContact(@RequestParam Long id) {
		contactServices.deleteById(id);
		return "redirect:list-contacts";
	}
	
	@GetMapping("/update-contact")
	public String updateContactPage(ModelMap map, @RequestParam Long id) {
		Optional<Contact> contact = contactServices.findById(id);
		map.put("contact", contact);
		return "updateContact";
	}
	
	@PostMapping("/update-contact")
	public String updateContact(ModelMap map, Contact contact, BindingResult bindingResult) {
		contactServices.updateContact(contact);
		return "redirect:list-contacts";
	}
}
