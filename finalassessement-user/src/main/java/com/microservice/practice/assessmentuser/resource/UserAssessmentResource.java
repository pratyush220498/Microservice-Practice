package com.microservice.practice.assessmentuser.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.practice.assessmentuser.model.UserAnswerResponse;
import com.microservice.practice.assessmentuser.model.UserResult;
import com.microservice.practice.assessmentuser.service.UserAssessmentService;

@RestController
@RequestMapping("/userassessment")
public class UserAssessmentResource {

	@Autowired
	UserAssessmentService service;
	
	UserAnswerResponse userAssessment;
	
	@PostMapping("/{userId}")
	public UserAnswerResponse getUserResponse(@RequestBody UserAnswerResponse userResponse)
	{
		return service.storeUserResponse(userResponse);
	}
	
	@GetMapping("/result")
	public UserResult getUserResult()
	{
		return service.returnUserResult();
	}
}
