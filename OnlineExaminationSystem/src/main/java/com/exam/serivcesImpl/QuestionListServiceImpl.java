package com.exam.serivcesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.QuestionEntity;
import com.exam.entity.QuestionListEntity;
import com.exam.repository.QuestionListRepository;
import com.exam.repository.QuestionRepository;
import com.exam.services.QuestionListService;
import com.exam.services.QuestionService;

@Service
public class QuestionListServiceImpl implements QuestionListService {

	@Autowired
	QuestionListRepository questionListRepository;
	
	// find all question Set list
	@Override
	public List<QuestionListEntity> fetchAllQuestionSet() {
		
		return questionListRepository.findAll();
	}
	// find question Set list by id
	@Override
	public QuestionListEntity getQuestionById(int id) {
		
		Optional<QuestionListEntity> fetchQuestion = questionListRepository.findById(id);
		
		if(fetchQuestion.isPresent()) {
			
			return fetchQuestion.get();
		}
		
		return null;
	}

	// create new question set list
	/***********create question set and questions******************************************/
	@Override
	public QuestionListEntity createQuestionSet(QuestionListEntity questionSet) {
		// TODO Auto-generated method stub
		return questionListRepository.save(questionSet);
	}




}
