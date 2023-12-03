package com.exam.serivcesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.QuestionEntity;
import com.exam.entity.QuestionListEntity;
import com.exam.repository.QuestionListRepository;
import com.exam.repository.QuestionRepository;
import com.exam.services.QuestionService;
@Service
public class QuestionserviceImpl implements QuestionService{

	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	QuestionListRepository questionListRepository;
	/*********find by foreign key from question search question set Id****************/
	@Override
	public List<QuestionEntity> getQuestionsByQSetId(int qSetId) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuestionListEntityQSetId(qSetId);
	}
	
	@Override
	public QuestionEntity addQuestionToSet(int qSetId, QuestionEntity question) {
		 QuestionListEntity questionSet = questionListRepository.findById(qSetId)
	             .orElseThrow(() -> new RuntimeException("Question set not found"));

	     // Set the question set for the new question
	     question.setQuestionListEntity(questionSet);

	     // Add the question to the set
	     questionSet.getQuestions().add(question);

	     // Save the updated question set
	     questionListRepository.save(questionSet);

	     // Return the added question
	     return question;
	}
}
