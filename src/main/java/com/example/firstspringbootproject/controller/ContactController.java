package com.example.firstspringbootproject.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.firstspringbootproject.model.Contact;
import com.example.firstspringbootproject.services.ContactServices;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("username")
public class ContactController {
	
	@Autowired
	public ContactServices contactServices;

	@RequestMapping(value = "/list-contacts", method = RequestMethod.GET)
	public String listAllContact(ModelMap map) {
		map.put("contacts", contactServices.getAllContacts());
		return "listcontact";
	}
	
	@RequestMapping(value = "/add-contacts", method = RequestMethod.GET)
	public String addContactPage(ModelMap map) {
		Contact contact = new Contact(0,null,null,null);
		map.put("contact", contact);
		return "addContact";
	}
	
	@RequestMapping(value = "/add-contacts", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") @Valid Contact contact, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "addContact";
		}
		contactServices.addContact(contact.getName(), contact.getMobile(), LocalDate.now().plusYears(1));
		return "redirect:list-contacts";
	}
	
	@RequestMapping(value = "/delete-contact", method = RequestMethod.GET)
	public String deleteContact(@RequestParam Long id) {
		contactServices.deleteContact(id);
		return "redirect:list-contacts";
	}
	
	@RequestMapping(value = "/update-contact", method = RequestMethod.GET)
	public String updateContactPage(ModelMap map, @RequestParam Long id) {
		Contact contact = contactServices.findById(id);
		map.put("contact", contact);
		return "updateContact";
	}
	
	@RequestMapping(value = "/update-contact", method = RequestMethod.POST)
	public String updateContact(ModelMap map, Contact contact, BindingResult bindingResult) {
		contactServices.updateContact(contact);
		return "redirect:list-contacts";
	}
}
