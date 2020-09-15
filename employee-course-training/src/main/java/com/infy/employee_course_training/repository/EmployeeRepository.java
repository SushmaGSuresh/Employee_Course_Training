package com.infy.employee_course_training.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.employee_course_training.model.Employee;



public interface EmployeeRepository extends CrudRepository<Employee,Integer>{


	//List<Employee> getAllEmployees();



	List<Employee> getEmployeeByempId(int empId);






}
