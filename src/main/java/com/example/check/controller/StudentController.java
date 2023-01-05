package com.example.check.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.check.models.Student;
import com.example.check.service.StudentService;
import com.example.check.serviceimpl.StudentServiceImpl;


@CrossOrigin(origins = "http://localhost:5050")
@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl studentservice;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveProduct(@RequestBody Student student) {
		return new ResponseEntity<>(studentservice.createStudent(student), HttpStatus.CREATED);
	}

	@GetMapping("/list")
	public ResponseEntity<?> getAllStudents() {
		return new ResponseEntity<>(studentservice.getAllStudents(), HttpStatus.OK);
	}
}
