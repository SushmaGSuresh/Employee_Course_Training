package com.infy.employee_course_training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.employee_course_training.model.Course;
import com.infy.employee_course_training.repository.CourseRepository;



@RestController
public class CourseController {
	@Autowired
	CourseRepository repository;
	
	@PostMapping("/createCourse")
	private Course createCourse(@RequestBody Course course) {
		repository.save(course);
	return course;}
	
	//@GetMapping("/getCourses")
	//private List<Course> getAllCourse(){
	//	return repository.getAll();
	//}
	
	
	@GetMapping("/getCourse/{courseId}")
	private List<Course> getCourseBycourseId(@PathVariable String courseId)
	{
		return repository.getCourseBycourseId(courseId);
	}
	
	@DeleteMapping("/deleteCourse/{courseId}")
	private void deleteCourse(@PathVariable("courseId") String courseId) {
		repository.deleteById(courseId);
	}
	
	@PutMapping("/updateCourse")
	private Course updateCourse(@RequestBody Course course) {
		repository.save(course);
		return course;
		}

}
