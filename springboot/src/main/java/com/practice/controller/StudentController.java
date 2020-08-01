package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.request.Student;
import com.practice.service.StudentService;

@RestController
@RequestMapping(path = "/student")
public class StudentController {


	@Autowired
	private StudentService studentService;
	
	@GetMapping( path ="/hello", produces = "application/json")
	public String getResult() {
		return "Hello";
	}
	
	@GetMapping(path = "/getStudent/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
		
	}
	
	@PutMapping(path = "/updatestudent")
	@ResponseStatus(HttpStatus.OK)
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
		
	}
}
