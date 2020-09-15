package com.infy.employee_course_training.model;


import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Embeddable;


import javax.persistence.Table;

import com.sun.istack.NotNull;

@Embeddable
@Table(name="Training")
public class TrainingIdentity implements Serializable  {
	
	@NotNull
	@Column
	private int empId;
	
	@NotNull
	@Column
	private String courseId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainingIdentity other = (TrainingIdentity) obj;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	
	
	
	
	

}
