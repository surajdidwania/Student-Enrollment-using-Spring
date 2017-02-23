package com.suraj.javaStyle.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Size(min=4,max=20)
	@NotEmpty
	@Column(name="username")
	private String username;
	
	@NotEmpty
	@Size(min=4,max=8)
	@Column(name="password")
	private String password;
	
	@NotEmpty
	@Column(name="first_name")
	private String firstname;
	
	@NotEmpty
	@Column(name="last_name")
	private String lastname;
	
	@DateTimeFormat(pattern="mm/dd/yyyy")
	@NotNull
	@Column(name="dob")
	private Date dob;
	
	@Email
	@NotEmpty
	@Column(name="email")
	private String email;
	
	public Student(String username, String password, String firstname, String lastname, Date dob, String email) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.email = email;
	}
	
	public Student()
	{
		
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", dob=" + dob + ", email=" + email + "]";
	}

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
