package com.ibm.springbootflight.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springbootflight.entities.Choice;


public interface ChoiceRepository extends JpaRepository<Choice, Integer>{
	public Choice findById(int id);

	public List<Choice> findBysurveyName(String surveyName);
} 


