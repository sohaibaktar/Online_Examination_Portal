package com.exam.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.admin.Entity.AdminEntity;


@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {

	public AdminEntity findByEmailAndPassword(String email, String password);
}
