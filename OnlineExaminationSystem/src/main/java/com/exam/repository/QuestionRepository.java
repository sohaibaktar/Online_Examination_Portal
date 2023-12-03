package com.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exam.entity.QuestionEntity;
@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Long>{

//	 List<QuestionEntity> findByQuestionListEntity(int qSetId);
	 @Query("SELECT q FROM QuestionEntity q WHERE q.questionListEntity.qSetId = :qSetId")
	 List<QuestionEntity> findByQuestionListEntityQSetId(@Param("qSetId") int qSetId);
}
