package com.exam.serivcesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.Result;
import com.exam.repository.ResultRepo;
import com.exam.services.ResultService;
@Service
public class ResultServiceImpl implements ResultService{

	@Autowired
	private ResultRepo resultRepository;
	 
	@Override
	public Result saveResult(Result result) {
		// TODO Auto-generated method stub
		return resultRepository.save(result);
	}

	@Override
	public List<Result> fetchAllResults() {
		// TODO Auto-generated method stub
		return resultRepository.findAll();
	}
	
	@Override
	public List<Result> getResultsByStudentId(Long studentId) {
	    return resultRepository.findByStudentId(studentId);
	}


}
