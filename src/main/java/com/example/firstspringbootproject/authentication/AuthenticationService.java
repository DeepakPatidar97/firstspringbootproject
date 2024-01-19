package com.example.firstspringbootproject.authentication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authentication(String username, String password) {
		return "Deepak97".equalsIgnoreCase(username) && "123456".equalsIgnoreCase(password);
	}
	
}
