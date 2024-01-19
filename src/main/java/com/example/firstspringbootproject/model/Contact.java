package com.example.firstspringbootproject.model;

import java.time.LocalDate;

public class Contact {

	private long id;
	private String name;
	private String mobile;
	private LocalDate date;
	
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(long id, String name, String mobile, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.date = date;
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

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", mobile=" + mobile + ", date=" + date + "]";
	}

	
	
}
