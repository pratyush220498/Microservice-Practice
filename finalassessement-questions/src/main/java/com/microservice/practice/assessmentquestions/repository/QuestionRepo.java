package com.microservice.practice.assessmentquestions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.practice.assessmentquestions.model.Question;

public interface QuestionRepo extends JpaRepository<Question, String>{
	
	List<Question> findByQuestionDomain(String questionDomain);
}
