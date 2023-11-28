package com.exam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "questionSet")
public class QuestionListEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qSetId;
	
	private String cls;
	
	private String subject;
	
	private int year;
	
	private String time;
		

}
