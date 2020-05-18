package com.capgemini.OnlineTestManagementSystem.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.OnlineTestManagementSystem.Entity.Question;
import com.capgemini.OnlineTestManagementSystem.Service.IQuestionService;

@RestController
@RequestMapping(value="/Online")
@CrossOrigin(origins="http://localhost:4200")
public class MyController 
{

	
	@Autowired
	private IQuestionService questionService;
	
	@PostMapping("/addQuestion")
	public Question createQuestion(Question question) 
	{
		return questionService.createQuestion(question);
	}

	@GetMapping("/Question")
	public List<Question> getAllQuestion()
	{
		return questionService.getAllQuestions();
	}

	
}
