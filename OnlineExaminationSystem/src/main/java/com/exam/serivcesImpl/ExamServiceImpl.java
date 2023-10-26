package com.exam.serivcesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.exam.entity.StudentEntity;
import com.exam.repository.ExamRepository;
import com.exam.services.ExamService;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	ExamRepository examRepository;
	
	@Override
	public StudentEntity addStudent(StudentEntity studentEntity) {
		StudentEntity stEntity = examRepository.save(studentEntity);
		return stEntity;
	}

	@Override
	public List<StudentEntity> fetchAllStudentEntities() {
		
		return examRepository.findAll();
	}

	@Override
	public StudentEntity getStudentById(int id) {
		
		Optional<StudentEntity> studentOps = examRepository.findById(id);
		
		if(studentOps.isPresent()) {
			
			return studentOps.get();
		}

		return null;
	}

}
