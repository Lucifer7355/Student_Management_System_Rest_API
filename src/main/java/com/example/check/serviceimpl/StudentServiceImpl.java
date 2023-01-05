package com.example.check.serviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.check.controller.StudentController;
import com.example.check.models.Laptop;
import com.example.check.models.Student;
import com.example.check.models.StudentCard;
import com.example.check.repository.StudentRepository;
import com.example.check.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> sss = studentrepository.findAll();
		return sss;
	}

	@Override
	public String createStudent(Student s) {
		
//		Student st = new Student();
//		
//		st.setDad(s.getDad());
//		st.setEmail(s.getEmail());
//		st.setStudentcard(s.getStudentcard());
//		
//		StudentCard sc = new StudentCard();
//		
//		sc.setBg(s.getStudentcard().getBg());
//		
//		Set<Laptop> gg;
//		gg = s.getLaptops();
//		
//		st.setStudentcard(sc);
//		sc.setStudent(st);
//		st.setLaptops(gg);
		studentrepository.save(s);
		
		return "Student Created";
	}
	
	
	
	

}
