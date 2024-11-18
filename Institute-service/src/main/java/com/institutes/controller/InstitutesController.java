package com.institutes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutes.models.Institutes;
import com.institutes.models.Student;
import com.institutes.service.InstitutesService;

@RestController
@RequestMapping("/institutes")
public class InstitutesController {

	@Autowired
	private InstitutesService institutesService;
	
	@PostMapping
	public Institutes createInstitutes(@RequestBody Institutes institutes) {
	return	institutesService.creatInstitutes(institutes);
	}
	
	@GetMapping
	public List<Institutes> getallInstitutes() {
	return	institutesService.getallInstitutes();
	}
	
	@GetMapping("/students/{instituteid}")
	public List<Student> getsttudentbyInstitutesid(@PathVariable("instituteid") Long instituteid) throws Exception {
	return	institutesService.getsttudentbyInstitutesid(instituteid);
	}
}
