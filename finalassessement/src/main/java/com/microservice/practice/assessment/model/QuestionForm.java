package com.microservice.practice.assessment.model;

public class QuestionForm {
	
	private String questionId;
	private String question;
	private String questionType;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	public QuestionForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionForm(String questionId, String question, String questionType, String option1, String option2, String option3,
			String option4) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.questionType = questionType;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	
	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}
	
	
}
