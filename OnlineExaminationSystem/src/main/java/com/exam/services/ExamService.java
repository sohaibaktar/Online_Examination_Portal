package com.exam.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.exam.entity.StudentEntity;

public interface ExamService {

	StudentEntity addStudent(StudentEntity studentEntity); //Adding Students
	
	List<StudentEntity> fetchAllStudentEntities(); //Fetching all Students

	StudentEntity getStudentById(int id); //Fetching Students by there ID
}
