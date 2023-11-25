package com.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull(message = "Enter your name")
	@NotBlank(message = "Please Enter your name")
	private String name;
	
	@NotNull(message = "Enter your class")
	@NotBlank(message = "PLease Enter your class")
	private String cls;
	
	@NotNull(message = "Enter your email")
	@NotBlank(message = "PLease Enter your email")
	private String email;
	
	@NotNull(message = "Enter your phone no.")
	private Long phone;
	
	@NotNull(message = "Enter your School Name")
	@NotBlank(message = "PLease Enter your School Name")
	private String schooleName;
	
	@NotNull(message = "Enter your Board Name")
	@NotBlank(message = "PLease Enter your Board Name")
	private String boardName;
	
	@NotNull(message = "Enter your password")
	@NotBlank(message = "Please Set your Password")
	private String password;
}
