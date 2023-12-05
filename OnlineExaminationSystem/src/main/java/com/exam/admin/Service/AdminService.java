package com.exam.admin.Service;

import java.util.List;
import java.util.Optional;

import com.exam.admin.Entity.AdminEntity;


public interface AdminService {
	
	Optional<AdminEntity> login(AdminEntity adminMailPass); //Admin Login.
	
	List<AdminEntity> fetchAllAdmin(); //Fetch All Admin.
}
