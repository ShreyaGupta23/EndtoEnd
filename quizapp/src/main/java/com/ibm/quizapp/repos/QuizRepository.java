package com.ibm.quizapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.quizapp.entities.Quiz;
public interface QuizRepository extends JpaRepository<Quiz,Integer> {
	public Quiz findByName(String name);

}
