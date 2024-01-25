package com.example.firstspringbootproject.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstspringbootproject.model.Contact;

public interface ContactRepositary extends JpaRepository<Contact, Long>{
	public List<Contact> findByUsername(String username);
	
	public void deleteById(Long id);
	
	public Optional<Contact> findById(Long id);
}
