package com.institutes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.institutes.models.Institutes;
import com.institutes.models.Student;
import com.institutes.resposirty.InstitutesResposirty;

@Service
public class InstitutesService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private InstitutesResposirty institutesResposirty;
	
	public Institutes creatInstitutes(Institutes institutes) {
		Institutes saveinstitutes = institutesResposirty.save(institutes);
		return saveinstitutes;
	}
	
	public List<Institutes> getallInstitutes() {
	return	institutesResposirty.findAll();
	}
	
	public List<Student> getsttudentbyInstitutesid(Long instituteid) throws Exception {
	 	 Optional<Institutes> optionalInstitute =institutesResposirty.findById(instituteid);
	 	 if(optionalInstitute.isEmpty()) {
	 		 throw new Exception("Institute with given not found");
	 	 }
	 	 
	 		Student[] student =restTemplate.getForObject("http://localhost:8080/students/institutes/" + instituteid, Student[].class );
	 		
	 		return List.of(student);
	 	 
	}
}
