package com.capgemini.OnlineTestManagementSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.OnlineTestManagementSystem.Entity.Question;
@Service
public interface IQuestionService {
	
	public Question createQuestion(Question question);
	
	public List<Question> getAllQuestions();
	
	

}

