package com.example.check.service;

import java.util.List;

import com.example.check.models.Student;

public interface StudentService {
	List<Student> getAllStudents();
	String createStudent(Student s);
	
}
