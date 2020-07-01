package com.microservice.practice.assessmentuser.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.practice.assessmentuser.model.UserResult;

public interface UserResultRepo extends JpaRepository<UserResult,String>{

}
