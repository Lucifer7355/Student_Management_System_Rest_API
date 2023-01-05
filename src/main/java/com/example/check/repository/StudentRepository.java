package com.example.check.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.check.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
