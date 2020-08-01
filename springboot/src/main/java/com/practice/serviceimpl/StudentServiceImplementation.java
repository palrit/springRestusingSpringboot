package com.practice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.model.request.Student;
import com.practice.repository.StudentRepository;
import com.practice.service.StudentService;

@Service
public class StudentServiceImplementation  implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudent(int id) {
		return studentRepository.getStudentById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.updateStudent(student);
	}

}
