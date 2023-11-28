package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entity.QuestionListEntity;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionListEntity, Integer>{

}
