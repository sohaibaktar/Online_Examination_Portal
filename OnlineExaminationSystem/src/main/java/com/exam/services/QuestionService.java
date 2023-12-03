package com.exam.services;

import java.util.List;

import com.exam.entity.QuestionEntity;


public interface QuestionService {

	List<QuestionEntity> getQuestionsByQSetId(int qSetId);

	QuestionEntity addQuestionToSet(int qSetId, QuestionEntity question);

}
