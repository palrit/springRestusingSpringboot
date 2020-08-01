package com.practice.service;

import org.springframework.stereotype.Service;

import com.practice.model.request.Student;

@Service
public interface StudentService {
	
	public Student getStudent(int id);
	
	public Student updateStudent(Student student);

}
