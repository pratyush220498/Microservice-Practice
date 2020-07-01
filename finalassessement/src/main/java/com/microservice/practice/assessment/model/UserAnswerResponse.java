package com.microservice.practice.assessment.model;

import java.util.List;

public class UserAnswerResponse {

	String assessmentId;
	List<UserAnswer> ansList;
	
	public UserAnswerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAnswerResponse(String assessmentid,List<UserAnswer> ansList) {
		super();
		this.ansList = ansList;
		this.assessmentId = assessmentid;
	}

	public List<UserAnswer> getAnsList() {
		return ansList;
	}

	public void setAnsList(List<UserAnswer> ansList) {
		this.ansList = ansList;
	}

	public String getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(String assessmentId) {
		this.assessmentId = assessmentId;
	}

	
		
}
