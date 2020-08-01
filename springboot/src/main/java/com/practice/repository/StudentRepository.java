package com.practice.repository;

import org.springframework.stereotype.Repository;

import com.practice.model.request.Student;

@Repository
public class StudentRepository {
	
	public Student getStudentById(int id) {
		
		Student student = new Student();
		student.setId(id);
		student.setName("Amrit");
		student.setCourse("Software Engineering");
		return student;
	}

	
	public Student updateStudent(Student student1) {
		
		Student student = new Student();
		student.setId(student1.getId());
		student.setName(student1.getName());
		student.setCourse(student1.getCourse());
		return student;
	}

	
}
