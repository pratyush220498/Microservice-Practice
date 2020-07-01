package com.microservice.practice.assessment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.practice.assessment.model.Question;
import com.microservice.practice.assessment.model.QuestionForm;
import com.microservice.practice.assessment.model.QuestionList;
import com.microservice.practice.assessment.model.UserAnswerResponse;
import com.microservice.practice.assessment.model.UserResult;

@Service
public class AssessmentService {

	@Autowired
	RestTemplate restTemplate;
	
	public List<QuestionForm> getQuestionPaper()
	{
		List<QuestionForm> formList = new ArrayList<QuestionForm>();
		
		QuestionList queList = restTemplate.getForObject("http://ASSESSMENT-QUESTION-SERVICE/questions/getquestion",QuestionList.class);
		for(Question ques : queList.getQuestionList())
		{
			QuestionForm form = new QuestionForm(ques.getQuestionId(), ques.getQuestionDomain(), ques.getQuestionName(), ques.getQuestionOptionA(), ques.getQuestionOptionB(), ques.getQuestionOptionC(), ques.getQuestionOptionD());
			formList.add(form);
		}
		
		return formList;
	}
	
	public List<QuestionForm> getQuestionPaperByType(String type)
	{
		List<QuestionForm> formList = new ArrayList<QuestionForm>();
		
		QuestionList queList = restTemplate.getForObject("http://ASSESSMENT-QUESTION-SERVICE/questions/getquestionbytype/"+type,QuestionList.class);
		for(Question ques : queList.getQuestionList())
		{
			QuestionForm form = new QuestionForm(ques.getQuestionId(), ques.getQuestionDomain(), ques.getQuestionName(), ques.getQuestionOptionA(), ques.getQuestionOptionB(), ques.getQuestionOptionC(), ques.getQuestionOptionD());
			formList.add(form);
		}
		
		return formList;
	}
	
	public QuestionForm getQuestionPaperById(String id)
	{
		
		Question ques = restTemplate.getForObject("http://ASSESSMENT-QUESTION-SERVICE/questions/getquestionbyid/"+id,Question.class);
		QuestionForm form = new QuestionForm(ques.getQuestionId(), ques.getQuestionDomain(), ques.getQuestionName(), ques.getQuestionOptionA(), ques.getQuestionOptionB(), ques.getQuestionOptionC(), ques.getQuestionOptionD());
		return form;
	}
	
	public UserAnswerResponse getUserResponse(UserAnswerResponse userAnswerResponse)
	{
		UserAnswerResponse userAssessmentResponse = restTemplate.postForObject("http://ASSESSMENT-USER-SERVICE/userassessment/"+userAnswerResponse.getAssessmentId(),userAnswerResponse, UserAnswerResponse.class);
		return userAssessmentResponse;
	}
	
	public UserResult getUserResult()
	{
		UserResult result = restTemplate.getForObject("http://ASSESSMENT-USER-SERVICE/userassessment/result", UserResult.class);
		return result;
	}
}
