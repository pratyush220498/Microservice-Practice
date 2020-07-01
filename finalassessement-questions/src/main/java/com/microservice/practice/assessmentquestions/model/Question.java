package com.microservice.practice.assessmentquestions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {

	@Id
	@Column(name="QuestionId")
	private String questionId;	
	@Column(name="QuestionDomain")
	private String questionDomain;
	@Column(name="QuestionName")
	private String questionName;
	@Column(name="QuestionOptionA")
	private String questionOptionA;
	@Column(name="QuestionOptionB")
	private String questionOptionB;
	@Column(name="QuestionOptionC")
	private String questionOptionC;
	@Column(name="QuestionOptionD")
	private String questionOptionD;
	@Column(name="QuestionRightOption")
	private String questionRightOption;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(String questionId, String questionDomain, String questionName, String questionOptionA,
			String questionOptionB, String questionOptionC, String questionOptionD, String questionRightOption) {
		super();
		this.questionId = questionId;
		this.questionDomain = questionDomain;
		this.questionName = questionName;
		this.questionOptionA = questionOptionA;
		this.questionOptionB = questionOptionB;
		this.questionOptionC = questionOptionC;
		this.questionOptionD = questionOptionD;
		this.questionRightOption = questionRightOption;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDomain() {
		return questionDomain;
	}

	public void setQuestionDomain(String questionDomain) {
		this.questionDomain = questionDomain;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getQuestionOptionA() {
		return questionOptionA;
	}

	public void setQuestionOptionA(String questionOptionA) {
		this.questionOptionA = questionOptionA;
	}

	public String getQuestionOptionB() {
		return questionOptionB;
	}

	public void setQuestionOptionB(String questionOptionB) {
		this.questionOptionB = questionOptionB;
	}

	public String getQuestionOptionC() {
		return questionOptionC;
	}

	public void setQuestionOptionC(String questionOptionC) {
		this.questionOptionC = questionOptionC;
	}

	public String getQuestionOptionD() {
		return questionOptionD;
	}

	public void setQuestionOptionD(String questionOptionD) {
		this.questionOptionD = questionOptionD;
	}

	public String getQuestionRightOption() {
		return questionRightOption;
	}

	public void setQuestionRightOption(String questionRightOption) {
		this.questionRightOption = questionRightOption;
	}

	
}
