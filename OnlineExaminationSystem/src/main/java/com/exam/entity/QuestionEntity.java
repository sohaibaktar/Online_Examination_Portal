package com.exam.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "question")
@JsonIgnoreProperties("questionSet")
public class QuestionEntity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long questionId;

	    private String questionText;

	    @ElementCollection
	    @CollectionTable(name = "options", joinColumns = @JoinColumn(name = "question_id"))
	    private List<String> options;

	    private String correctOption;

	    @ManyToOne
	    @JoinColumn(name = "qSetId")
	    @JsonBackReference
	    private QuestionListEntity questionListEntity;

}
