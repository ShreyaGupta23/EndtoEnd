package com.ibm.quizapp.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.quizapp.entities.Question;
public interface QuestionRepository extends JpaRepository<Question,Integer>{

}
