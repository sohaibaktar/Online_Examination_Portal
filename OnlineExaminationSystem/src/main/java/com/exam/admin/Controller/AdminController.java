package com.exam.admin.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.admin.Entity.AdminEntity;
import com.exam.admin.Service.AdminService;
import com.exam.entity.BoardEntity;
import com.exam.entity.QuestionListEntity;
import com.exam.entity.SchoolEntity;
import com.exam.services.BoardService;
import com.exam.services.QuestionListService;
import com.exam.services.SchoolService;

@RestController
@CrossOrigin()
public class AdminController {

	@Autowired
	QuestionListService questionListService;
	@Autowired
	BoardService boardService;
	@Autowired
	SchoolService schoolService;
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/admin")
	public ResponseEntity<Object> adminLogin(@RequestBody AdminEntity adminMailPass){
		
		Optional<AdminEntity> admin = adminService.login(adminMailPass);
		
		if(admin.isPresent()) {
			
			return ResponseEntity.ok(Collections.singletonMap("adminId", admin.get().getId()));
		}
		else {
			return ResponseEntity.badRequest().body("Invalid Login!");
		}
	}
	
	@GetMapping("/admin")
	public List<AdminEntity> fetchAllAdmin(){
		
		return adminService.fetchAllAdmin();
	}

///////////////////////////----------------Adding Section-----------------/////////////////////////////////////////////////		
	
	@PostMapping("/addQuestion")
	public ResponseEntity<String> addQuestionList(@RequestBody QuestionListEntity questionListEntity){
		
		questionListService.createQuestionSet(questionListEntity);
		
		return new ResponseEntity<>("Question Added!!!",HttpStatus.OK);
	}
	
	@PostMapping("/addBoard")
	public ResponseEntity<String> addBoard(@RequestBody BoardEntity boardEntity){
		
		boardService.addBoard(boardEntity);
		
		return new ResponseEntity<>("Board Added!!!",HttpStatus.OK);
	}
	
	@PostMapping("/addSchool")
	public ResponseEntity<String> addSchool(@RequestBody SchoolEntity schoolEntity){
		
		schoolService.addSchool(schoolEntity);
		
		return new ResponseEntity<>("School Added!!!",HttpStatus.OK);
	}
	
///////////////////////////----------------Delete Section-----------------///////////////////////////////////////////////////	
	
	@DeleteMapping("/deleteSchool/{id}")
	public String deleteSchool(@PathVariable("id") int id) {
		
		return schoolService.deleteSchool(id);
	}
	
	@DeleteMapping("/deleteBoard/{id}")
	public String deleteBoard(@PathVariable("id") int id) {
		
		return boardService.deleteBoard(id);
	}
	
	@DeleteMapping("/deleteQuestion/{id}")
	public String deleteQuestionList(@PathVariable("id") int id) {
		
		return questionListService.deleteQuestionList(id);
	}
}
