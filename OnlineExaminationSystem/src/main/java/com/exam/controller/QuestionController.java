package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.QuestionEntity;
import com.exam.entity.QuestionListEntity;
import com.exam.services.QuestionService;

@RestController
@CrossOrigin()
public class QuestionController {
	@Autowired
	QuestionService questionService;
	
	// find questions
	@GetMapping("/questionsets/{qSetId}")
    public ResponseEntity<List<QuestionEntity>> getQuestionsByQSetId(@PathVariable int qSetId) {
        List<QuestionEntity> questions = questionService.getQuestionsByQSetId(qSetId);
        return ResponseEntity.ok(questions);
    }
	
	// add question 
	 @PostMapping("/questionsets/{qSetId}/addQuestion")
	    public ResponseEntity<QuestionEntity> addQuestionToSet(
	            @PathVariable int qSetId,
	            @RequestBody QuestionEntity question) {
	        QuestionEntity addedQuestion = questionService.addQuestionToSet(qSetId, question);
	        return new ResponseEntity<>(addedQuestion, HttpStatus.CREATED);
	    }

}
