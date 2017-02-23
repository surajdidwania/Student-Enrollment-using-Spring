package com.suraj.javaStyle.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class StudentLogin {
	
	@NotEmpty
	@Size(min=4, max=20)
	private String username;
	@NotEmpty
	@Size(min=4, max=8)
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public StudentLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StudentLogin()
	{}
}
