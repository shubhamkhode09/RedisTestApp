package com.cano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cano.entity.Student;
import com.cano.repo.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository repository;
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		repository.save(student);
		
		return "record save";
	}
	
	@GetMapping("/")
	public Iterable<Student> getAllStudent() {
		return repository.findAll();
	}
	
}
