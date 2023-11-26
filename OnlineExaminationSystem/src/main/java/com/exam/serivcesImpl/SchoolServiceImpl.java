package com.exam.serivcesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.SchoolEntity;
import com.exam.repository.SchoolRepository;
import com.exam.services.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	SchoolRepository schoolRepo;

	@Override
	public List<SchoolEntity> fetchAllSchool() {
		
		return schoolRepo.findAll();
	}

}
