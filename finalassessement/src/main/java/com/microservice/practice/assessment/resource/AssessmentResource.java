package com.microservice.practice.assessment.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.practice.assessment.model.QuestionForm;
import com.microservice.practice.assessment.model.UserAnswerResponse;
import com.microservice.practice.assessment.model.UserResult;
import com.microservice.practice.assessment.service.AssessmentService;

@RestController
@RequestMapping("/assessment")
public class AssessmentResource {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	AssessmentService service;
	
	@RequestMapping("/form")
	public List<QuestionForm> getQuestionForm()
	{
		return service.getQuestionPaper();
	}
	
	@GetMapping("/formbytype/{type}")
	public List<QuestionForm> getQuestionFormByType(@PathVariable("type") String type)
	{
		return service.getQuestionPaperByType(type);
	}
	
	@GetMapping("/formbyid/{id}")
	public QuestionForm getFormById(@PathVariable("id") String id)
	{
		return service.getQuestionPaperById(id);
	}
	
	@PostMapping("/submitform/{userId}")
	public UserAnswerResponse getUserResponse(@RequestBody UserAnswerResponse userResponse)
	{
		return service.getUserResponse(userResponse);
	}
	
	@GetMapping("/result")
	public UserResult getResult()
	{
		return service.getUserResult();
	}
}
