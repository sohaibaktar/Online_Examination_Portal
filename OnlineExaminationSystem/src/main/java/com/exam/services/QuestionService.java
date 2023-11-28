package com.exam.services;

import java.util.List;

import com.exam.entity.QuestionListEntity;

public interface QuestionService {

	List<QuestionListEntity>fetchAllQuestionSet();		//Fetch All Questions.
	
	QuestionListEntity getQuestionById(int id);			//Fetch Questions By Id.
}
