package com.microservice.practice.assessmentquestions.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.practice.assessmentquestions.model.Question;
import com.microservice.practice.assessmentquestions.model.QuestionList;
import com.microservice.practice.assessmentquestions.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionResource {
		
	@Autowired
	public QuestionService service;
		
	@GetMapping("/getquestion")
	public QuestionList getQuestions()
	{
		return new QuestionList(service.getAllQuestion());
	}
	
	@GetMapping("/getquestionbyid/{qid}")
	public Question getQuestion(@PathVariable("qid") String qid) {
		return service.getQuestionById(qid);		 
	}
	
	@GetMapping("/getquestionbytype/{questionType}")
	public QuestionList getQuestionsByType(@PathVariable("questionType") String questionType)
	{
			return new QuestionList(service.getQuestionByType(questionType)); 
	}
	
}
