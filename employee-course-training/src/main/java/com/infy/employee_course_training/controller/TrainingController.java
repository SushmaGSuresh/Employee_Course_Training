package com.infy.employee_course_training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infy.employee_course_training.model.Training;
import com.infy.employee_course_training.repository.TrainingRepository;

@RestController
public class TrainingController {
	
	@Autowired
	TrainingRepository repository;
	
	@GetMapping("/getTraining/{status}")
	private List<Training> getTrainingByStatus(@PathVariable String status)
	{
		return repository.getTrainingByStatus(status);
	}

}
