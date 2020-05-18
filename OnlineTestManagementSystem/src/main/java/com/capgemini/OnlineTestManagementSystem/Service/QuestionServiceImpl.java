package com.capgemini.OnlineTestManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.OnlineTestManagementSystem.Entity.Question;
import com.capgemini.OnlineTestManagementSystem.Repository.IQuestionRepository;


@Service
public class QuestionServiceImpl implements IQuestionService{
	
	@Autowired 
	IQuestionRepository questionRepository;

	@Override
	public Question createQuestion(Question question)
	{
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestions() 
	{
		return (List<Question>) questionRepository.findAll();
	}

}
