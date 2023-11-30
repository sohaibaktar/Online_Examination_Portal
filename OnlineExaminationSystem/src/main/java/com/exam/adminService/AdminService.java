package com.exam.adminService;

import java.util.List;
import java.util.Optional;

import com.exam.admin.AdminEntity;

public interface AdminService {
	
	Optional<AdminEntity> login(AdminEntity adminMailPass); //Admin Login.
	
	List<AdminEntity> fetchAllAdmin(); //Fetch All Admin.
}
