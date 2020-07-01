package com.microservice.practice.assessmentuser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userresult")
public class UserResult {

	@Id
	@Column(name="UserId")
	private String userId;
	@Column(name="UserActualMarks")
	private float actualMarks;
	@Column(name="UserCurrentMarks")
	private float currentMarks;
	@Column(name="UserPercentage")
	private float percenteage;
	
	public UserResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserResult(String userId, float actualMarks, float currentMarks, float percenteage) {
		super();
		this.userId = userId;
		this.actualMarks = actualMarks;
		this.currentMarks = currentMarks;
		this.percenteage = percenteage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public float getActual() {
		return actualMarks;
	}

	public void setActual(float actualMarks) {
		this.actualMarks = actualMarks;
	}

	public float getCurrent() {
		return currentMarks;
	}

	public void setCurrent(float currentMarks) {
		this.currentMarks = currentMarks;
	}

	public float getPercenteage() {
		return percenteage;
	}

	public void setPercenteage(float percenteage) {
		this.percenteage = percenteage;
	}

	@Override
	public String toString() {
		return "UserResult [userId=" + userId + ", actualMarks=" + actualMarks + ", currentMarks=" + currentMarks
				+ ", percenteage=" + percenteage + "]";
	}

		
}
