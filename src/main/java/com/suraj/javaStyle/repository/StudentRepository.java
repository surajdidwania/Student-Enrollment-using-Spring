package com.suraj.javaStyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.suraj.javaStyle.model.Student;
import com.suraj.javaStyle.model.StudentLogin;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@Query("select s from Student where s.username = :username")
	Student findByUserName(@Param("username") String username);
}
