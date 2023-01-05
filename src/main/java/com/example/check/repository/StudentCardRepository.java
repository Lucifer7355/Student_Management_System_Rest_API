package com.example.check.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.check.models.StudentCard;

public interface StudentCardRepository extends JpaRepository<StudentCard, Long> {

}
