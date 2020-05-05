package com.ibm.springbootflight.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springbootflight.entities.Survey;


public interface SurveyRepository extends JpaRepository<Survey, Integer>{
	public Survey findByName(String name);

}