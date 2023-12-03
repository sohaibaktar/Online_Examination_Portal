package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Result;
import com.exam.services.ResultService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ResultController {
	@Autowired
	ResultService resultService;
	
	@GetMapping("/results")
	public List<Result> fetchAllResults(){
		return resultService.fetchAllResults();
	}
	
	 @PostMapping("/results")
	 public Result saveResult(@RequestBody Result result) {
	       return resultService.saveResult(result);
	 }
	 
	 @GetMapping("/results/{studentId}")
	 public List<Result> getResultsByStudentId(@PathVariable("studentId") Long studentId) {
	     return resultService.getResultsByStudentId(studentId);
	 }


}
