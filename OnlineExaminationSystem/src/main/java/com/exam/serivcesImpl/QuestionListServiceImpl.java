package com.exam.serivcesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.QuestionListEntity;
import com.exam.repository.QuestionListRepository;
import com.exam.services.QuestionListService;

@Service
public class QuestionListServiceImpl implements QuestionListService {

	@Autowired
	QuestionListRepository questionListRepository;
	
	@Override
	public List<QuestionListEntity> fetchAllQuestionSet() {
		
		return questionListRepository.findAll();
	}

	@Override
	public QuestionListEntity getQuestionById(int id) {
		
		Optional<QuestionListEntity> fetchQuestion = questionListRepository.findById(id);
		
		if(fetchQuestion.isPresent()) {
			
			return fetchQuestion.get();
		}
		
		return null;
	}

	@Override
	public QuestionListEntity addQuestionList(QuestionListEntity questionListEntity) {
		
		return questionListRepository.save(questionListEntity);
	}

	@Override
	public String deleteQuestionList(int id) {

		if(questionListRepository.findById(id).isPresent()) {
			
			questionListRepository.deleteById(id);
			
			return "Successfully remove the QuestionList";
		}
		return "Sorry no such QuestionList found";
	
	}

}
