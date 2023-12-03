package com.exam.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "questionsetlist")
public class QuestionListEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int qSetId;
	
	private String setname;
	
	private String cls;
	
	private String subject;
	
	private int year;
	
	private String time;
		
	@OneToMany(mappedBy = "questionListEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<QuestionEntity> questions;


}
