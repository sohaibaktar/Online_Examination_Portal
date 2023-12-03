package com.exam.services;

import java.util.List;

import com.exam.entity.QuestionListEntity;

public interface QuestionListService {

	QuestionListEntity addQuestionList(QuestionListEntity questionListEntity); //Add Questions.
	
	List<QuestionListEntity>fetchAllQuestionSet();		//Fetch All Questions.
	
	QuestionListEntity getQuestionById(int id);			//Fetch Questions By Id.
	
	String deleteQuestionList(int id); //Delete Customer By id
}
