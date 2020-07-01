package com.microservice.practice.assessmentuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.practice.assessmentuser.model.Question;
import com.microservice.practice.assessmentuser.model.QuestionList;
import com.microservice.practice.assessmentuser.model.UserAnswer;
import com.microservice.practice.assessmentuser.model.UserAnswerResponse;
import com.microservice.practice.assessmentuser.model.UserResult;
import com.microservice.practice.assessmentuser.repo.UserResultRepo;

@Service
public class UserAssessmentService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	UserResultRepo repo;
	
	UserAnswerResponse userResponse;
	
	public UserAnswerResponse storeUserResponse(UserAnswerResponse userResponse)
	{
		this.userResponse=userResponse;
		return userResponse;
	}
	
	public UserResult returnUserResult()
	{
		float percentage=0;
		List<UserAnswer> userAnswer = this.userResponse.getAnsList();
		QuestionList queList = restTemplate.getForObject("http://ASSESSMENT-QUESTION-SERVICE/questions/getquestion",QuestionList.class);
		List<Question> ques = queList.getQuestionList();
		float marks=0;
		float total=0;
		for(UserAnswer ans : userAnswer)
		{
			for(Question question : ques)
			{
				if(ans.getQid().equals(question.getQuestionId())&&ans.getAns().equals(question.getQuestionRightOption()))
				{
					marks=marks+10;
				}
			}
			total=total+10;
		}
		percentage=(marks/total)*100;
		UserResult result = new UserResult(userResponse.getAssessmentId(),marks,total,percentage);
		System.out.println(result);
		repo.save(result);
		return result;	
	}
}
