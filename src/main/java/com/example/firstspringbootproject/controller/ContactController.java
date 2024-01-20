package com.example.firstspringbootproject.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.firstspringbootproject.services.ContactServices;

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
	public String addContactPage() {
		return "addContact";
	}
	
	@RequestMapping(value = "/add-contacts", method = RequestMethod.POST)
	public String addContact(@RequestParam String name, @RequestParam String mobile) {
		contactServices.addContact(name, mobile, LocalDate.now().plusYears(1));
		return "redirect:list-contacts";
	}
}
