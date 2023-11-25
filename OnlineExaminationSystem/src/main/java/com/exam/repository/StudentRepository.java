package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	StudentEntity findByEmail(String email);
	
	public StudentEntity findByEmailAndPassword(String email, String password);
	
	boolean existsByEmail(String email);
	
	boolean existsByPhone(Long phone);
}
