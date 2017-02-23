package com.suraj.javaStyle.service;

import com.suraj.javaStyle.model.Student;

public interface StudentService {

	Student save(Student student);
	boolean findbylogin(String username, String password);
	boolean findbyusername(String username);
}
