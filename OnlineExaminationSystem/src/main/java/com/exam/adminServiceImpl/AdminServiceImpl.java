package com.exam.adminServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.admin.AdminEntity;
import com.exam.adminRepository.AdminRepository;
import com.exam.adminService.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Optional<AdminEntity> login(AdminEntity adminMailPass) {
		
		return Optional.ofNullable
				(adminRepository.findByEmailAndPassword(adminMailPass.getEmail(),adminMailPass.getPassword()));
	}

	@Override
	public List<AdminEntity> fetchAllAdmin() {

		return adminRepository.findAll();
	}

}
