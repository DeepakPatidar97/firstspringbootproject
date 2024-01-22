package com.example.firstspringbootproject.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.print.DocFlavor.INPUT_STREAM;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public InMemoryUserDetailsManager createUserDetails() {
		Function<String, String> passwordEncoder = intput -> passwordEncoder().encode(intput);
		UserDetails user1 = User.builder()
				.passwordEncoder(passwordEncoder)
				.username("Deepak97").password("Dummy").roles("USER", "ADMIN").build();
		
		UserDetails user2 = User.builder()
				.passwordEncoder(passwordEncoder)
				.username("Priya96").password("Dummy").roles("USER", "ADMIN").build();
		
		return new InMemoryUserDetailsManager(Arrays.asList(user1,user2));
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
