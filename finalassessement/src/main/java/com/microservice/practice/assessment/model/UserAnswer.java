package com.microservice.practice.assessment.model;

public class UserAnswer {

	private String qid;
	private String ans;
	
	public UserAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAnswer(String qid, String ans) {
		super();
		this.qid = qid;
		this.ans = ans;
	}

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
}
