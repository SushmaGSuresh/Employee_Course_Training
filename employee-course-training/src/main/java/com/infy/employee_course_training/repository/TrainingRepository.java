package com.infy.employee_course_training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.employee_course_training.model.Training;
import com.infy.employee_course_training.model.TrainingIdentity;

public interface TrainingRepository extends JpaRepository<Training,TrainingIdentity>{


	List<Training> getTrainingByStatus(String status);

}
