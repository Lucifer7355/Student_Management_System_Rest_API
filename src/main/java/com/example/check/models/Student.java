package com.example.check.models;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity(name="Student")
@Table(name="student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="student_email")
	private String email;
	
	@Column(name="student_dad")
	private String dad;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private StudentCard studentcard;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
	private Set<Laptop> laptops;
	
	//@JsonManagedReference
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(
                    name = "student_foreign_key", referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "course_foreign_key", referencedColumnName = "id"
            )
    )
	private Set<Course> courses;
	
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", dad=" + dad + ", studentcard=" + studentcard + ", getId()="
				+ getId() + ", getEmail()=" + getEmail() + ", getDad()=" + getDad() + ", getStudentcard()="
				+ getStudentcard() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Student(String email, String dad) {
		super();
		this.email = email;
		this.dad = dad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDad() {
		return dad;
	}

	public void setDad(String dad) {
		this.dad = dad;
	}
	
	public StudentCard getStudentcard() {
		return studentcard;
	}

	public void setStudentcard(StudentCard studentcard) {
		this.studentcard = studentcard;
	}

	public Set<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(Set<Laptop> laptops) {
		this.laptops = laptops;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
}
