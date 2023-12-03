package com.exam.adminController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.admin.AdminEntity;
import com.exam.adminService.AdminService;
import com.exam.entity.QuestionListEntity;
import com.exam.services.QuestionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	
	
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
	
	
}
