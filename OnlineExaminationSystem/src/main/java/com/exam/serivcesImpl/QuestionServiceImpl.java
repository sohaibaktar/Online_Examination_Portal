package com.exam.serivcesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.QuestionListEntity;
import com.exam.repository.QuestionRepository;
import com.exam.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;
	
	@Override
	public List<QuestionListEntity> fetchAllQuestionSet() {
		
		return questionRepository.findAll();
	}

	@Override
	public QuestionListEntity getQuestionById(int id) {
		
		Optional<QuestionListEntity> fetchQuestion = questionRepository.findById(id);
		
		if(fetchQuestion.isPresent()) {
			
			return fetchQuestion.get();
		}
		
		return null;
	}

	@Override
	public QuestionListEntity addQuestionList(QuestionListEntity questionListEntity) {
		
		return questionRepository.save(questionListEntity);
	}

}
