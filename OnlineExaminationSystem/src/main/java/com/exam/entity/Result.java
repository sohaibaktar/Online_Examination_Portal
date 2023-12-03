package com.exam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "results")
public class Result {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long result_id;

	    @ManyToOne
	    @JoinColumn(name = "student_id")
	    private StudentEntity student;

	    @OneToOne
	    @JoinColumn(name = "question_set_id")
	    private QuestionListEntity questionSetId;

	    @Column(name = "total_questions_attempted")
	    private int totalQuestionsAttempted;

	    @Column(name = "total_correct_answered")
	    private int totalCorrectAnswered;

	    @Column(name = "total_wrong_answered")
	    private int totalWrongAnswered;

	    @Column(name = "score")
	    private int score;

}
