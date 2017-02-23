package com.suraj.javaStyle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.javaStyle.model.Student;
import com.suraj.javaStyle.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentrepository;
	@Transactional
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	public boolean findbylogin(String username, String password) {
		Student stud = studentrepository.findByUserName(username);
		if(stud!=null && stud.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}

	public boolean findbyusername(String username) {
		Student stud = studentrepository.findByUserName(username);
		if(stud!=null )
		{
			return true;
		}
		return false;
	}

	
}
