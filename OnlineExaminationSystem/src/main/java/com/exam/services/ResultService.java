package com.exam.services;

import java.util.List;

import com.exam.entity.Result;

public interface ResultService {

	Result saveResult(Result result);

	List<Result> fetchAllResults();

	List<Result> getResultsByStudentId(Long studentId);

}
