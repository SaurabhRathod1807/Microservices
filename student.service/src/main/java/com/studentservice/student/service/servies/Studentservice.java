package com.studentservice.student.service.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentservice.student.service.model.Student;
import com.studentservice.student.service.respositories.StudentRespositories;

@Service
public class Studentservice {
	
	@Autowired
	private StudentRespositories studentRespositories;
	
	 public Student createStudent(Student student) {
		Student savedstudent = studentRespositories.save(student);
		
		return savedstudent;
	 }
	 
	 
	 public List<Student> getStudentbyinstituteid(Integer instituteid) {
	return studentRespositories.findAllByInstituteid(instituteid);
		 
	 }
}
