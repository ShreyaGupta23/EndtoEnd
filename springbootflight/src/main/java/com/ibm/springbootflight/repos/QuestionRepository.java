package com.ibm.springbootflight.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springbootflight.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}