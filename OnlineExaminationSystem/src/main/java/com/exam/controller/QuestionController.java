package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.QuestionListEntity;
import com.exam.services.QuestionListService;

@RestController
@CrossOrigin()
public class QuestionController {
	
	@Autowired
	QuestionListService questionListService;
	
	@GetMapping("/questionList")
	public List<QuestionListEntity> fetchAllQuestions(){
		
		return questionListService.fetchAllQuestionSet();
	}
	
	@GetMapping("/questionList/{id}")
	public QuestionListEntity getQuestionById(@PathVariable("id") int id) {
		
		return questionListService.getQuestionById(id);
	}

}
