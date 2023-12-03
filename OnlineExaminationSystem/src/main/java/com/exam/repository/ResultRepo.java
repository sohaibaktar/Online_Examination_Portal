package com.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Result;

public interface ResultRepo extends JpaRepository<Result, Long>{

	List<Result> findByStudentId(Long studentId);
}
