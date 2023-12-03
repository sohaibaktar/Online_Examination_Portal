package com.exam.services;

import java.util.List;

import com.exam.entity.SchoolEntity;

public interface SchoolService {

	List<SchoolEntity> fetchAllSchool();	//Fetch All School.
	
	SchoolEntity addSchool(SchoolEntity schoolEntity);	//Add School.
	
	String deleteSchool(int id); //Delete Customer By id
}
