package com.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entity.QuestionEntity;
import com.exam.entity.QuestionListEntity;

@Repository
public interface QuestionListRepository extends JpaRepository<QuestionListEntity, Integer>{

	
}
