package com.studentservice.student.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentservice.student.service.model.Student;
import com.studentservice.student.service.servies.Studentservice;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private Studentservice studentservice;
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
	return	studentservice.createStudent(student);
	}
	
	@GetMapping("/institutes/{instituteid}")
	public List<Student> getStudentbyinstituteid(@PathVariable("instituteid") Integer instituteid) {
	return	studentservice.getStudentbyinstituteid(instituteid);
		
		
		
	}
}
