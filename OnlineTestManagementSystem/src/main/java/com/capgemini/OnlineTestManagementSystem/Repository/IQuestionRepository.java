package com.capgemini.OnlineTestManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.OnlineTestManagementSystem.Entity.Question;

@Repository("questionRepository")
public interface IQuestionRepository extends CrudRepository<Question, Integer>{

}
