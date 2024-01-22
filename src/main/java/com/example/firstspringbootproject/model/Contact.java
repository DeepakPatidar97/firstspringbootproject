package com.example.firstspringbootproject.model;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;

public class Contact {

	private long id;
	private String name;
	
	@Size(min = 10,max = 10, message = "Enter 10 number")
	private String mobile;
	private LocalDate date;
	private String username;
	
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(long id, String name, String mobile, LocalDate date, String username) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.date = date;
		this.username = username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
