package com.microservice.practice.assessment.model;

import java.util.List;

public class QuestionList {
	
	public List<Question> questionList;

	public QuestionList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionList(List<Question> questionList) {
		super();
		this.questionList = questionList;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
		
}
