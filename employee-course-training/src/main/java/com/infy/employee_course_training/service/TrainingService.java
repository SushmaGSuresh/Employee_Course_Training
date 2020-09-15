package com.infy.employee_course_training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.employee_course_training.model.Training;
import com.infy.employee_course_training.repository.TrainingRepository;

@Service
public class TrainingService {
	
	@Autowired
	TrainingRepository repository;
	
	public List<Training> getAllTrainings(){
		List<Training> training=new ArrayList<Training>();
		repository.findAll().forEach(training1->training.add(training1));
		return training;
		
	} 


}
