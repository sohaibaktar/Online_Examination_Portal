package com.exam.admin.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "admin")
public class AdminEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String email;
	
	private String password;
	
}
