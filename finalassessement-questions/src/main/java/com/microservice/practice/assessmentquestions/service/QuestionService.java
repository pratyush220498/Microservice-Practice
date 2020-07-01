package com.microservice.practice.assessmentquestions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.practice.assessmentquestions.model.Question;
import com.microservice.practice.assessmentquestions.repository.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	QuestionRepo repo;
	
	public List<Question> getAllQuestion() {
		return repo.findAll();
	}
	
	public List<Question> getQuestionByType(String section) {		
	  return repo.findByQuestionDomain(section);
	}

	public Question getQuestionById(String qid) {
		return repo.findById(qid).orElse(null);		
	}
}
