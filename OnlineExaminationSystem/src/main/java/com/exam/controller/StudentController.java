package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.StudentEntity;
import com.exam.services.ExamService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	ExamService examService;
	
	@PostMapping("/students")
	public ResponseEntity<StudentEntity> addStudent(@RequestBody @Valid StudentEntity studentEntity) {
		
		return new ResponseEntity<>(examService.addStudent(studentEntity),HttpStatus.CREATED);
	}
	
	@GetMapping("/students")
	public List<StudentEntity> fetchAllStudent(){
		
		return examService.fetchAllStudentEntities();
	}
	
	@GetMapping("/getStudentById/{id}")
	public StudentEntity getStudentById(@PathVariable("id") int id) {
		
		return examService.getStudentById(id);
	}
}
