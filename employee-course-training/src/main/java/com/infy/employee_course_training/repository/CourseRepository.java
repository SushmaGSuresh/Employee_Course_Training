package com.infy.employee_course_training.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.employee_course_training.model.Course;


public interface CourseRepository extends CrudRepository<Course,String>{


	List<Course> getCourseBycourseId(String courseId);

	//List<Course> getAll();

}
