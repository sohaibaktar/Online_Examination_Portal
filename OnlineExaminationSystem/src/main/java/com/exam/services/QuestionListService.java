package com.exam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.entity.QuestionListEntity;
@Service
public interface QuestionListService {
	
	List<QuestionListEntity>fetchAllQuestionSet();		//Fetch All Questions.
	
	QuestionListEntity getQuestionById(int id);			//Fetch Questions By Id.

	QuestionListEntity createQuestionSet(QuestionListEntity questionSet); //create ques set
	
	String deleteQuestionList(int id); //Delete Customer By id
}
