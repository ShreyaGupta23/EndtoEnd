package com.ibm.quizapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.quizapp.entities.Question;
import com.ibm.quizapp.entities.Quiz;
import com.ibm.quizapp.repos.QuestionRepository;
import com.ibm.quizapp.repos.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	QuizRepository quizRepository;
	public Question addQuestions(Question question) {
		return questionRepository.save(question);
		
	}

	public List<Question> findAllQuestion() {
		List<Question> questions =  questionRepository.findAll();
		//System.out.println(questions);
		return questions;
	}
	
	public Quiz addQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
		
	}

	public List<Quiz> findAllQuiz() {
		List<Quiz> quizzes =  quizRepository.findAll();
		//System.out.println(quizzes);
		return quizzes;
	}

	public Quiz findQuizByName(String name) {
		return quizRepository.findByName(name);
	}
}
