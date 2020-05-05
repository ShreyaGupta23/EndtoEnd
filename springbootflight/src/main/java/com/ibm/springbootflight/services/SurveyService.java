package com.ibm.springbootflight.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.springbootflight.entities.Choice;
import com.ibm.springbootflight.entities.Question;
import com.ibm.springbootflight.entities.Survey;
import com.ibm.springbootflight.repos.ChoiceRepository;
import com.ibm.springbootflight.repos.QuestionRepository;
import com.ibm.springbootflight.repos.SurveyRepository;


@Service
public class SurveyService {
	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	SurveyRepository surveyRepository;
	
	
	
	@Autowired
	ChoiceRepository choiceRepository;

	public Question addQuestions(Question question) {
		return questionRepository.save(question);
		
	}

	public List<Question> findAllQuestion() {
		List<Question> questions =  questionRepository.findAll();
		System.out.println(questions);
		return questions;
	}
	
public List<Choice> findAllChoices() {
	List<Choice> choices =  choiceRepository.findAll();
		System.out.println(choices);
		return choices;
	}
	
	
	public Survey addSurvey(Survey quiz) {
		return surveyRepository.save(quiz);
		
	}
	
	@Transactional
	public void updateChoice(Choice updatedChoice) {

		Choice choice = choiceRepository.findById(updatedChoice.getId());
		choice.setCount(updatedChoice.getCount());
		choice.setChoice_text(updatedChoice.getChoice_text());
	}


	public List<Survey> findAllSurveys() {
		List<Survey> surveys =  surveyRepository.findAll();
		System.out.println(surveys);
		return surveys;
	}

	public Survey findSurveyByName(String name) {
		return surveyRepository.findByName(name);
	}

	@Transactional
	public List<Choice> findChoice(String surveyName) {
		
		return choiceRepository.findBysurveyName(surveyName);
	}

	
}
