package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.QuestionListEntity;
import com.exam.services.QuestionService;

@RestController
@CrossOrigin()
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("/questionList")
	public List<QuestionListEntity> fetchAllQuestions(){
		
		return questionService.fetchAllQuestionSet();
	}

}
