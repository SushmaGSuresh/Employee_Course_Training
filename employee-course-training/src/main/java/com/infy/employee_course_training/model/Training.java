package com.infy.employee_course_training.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Training {
	
	@EmbeddedId

	private TrainingIdentity trainingIdentity;
	@Column
	private Float score;
	@Column
	private Float hours_spent;
		
	//Duration duration = Duration.ofSeconds(3000);
	//long hours = duration.toHours();
	//int minutes = (int) ((duration.getSeconds() % (60 * 60)) / 60);
	//String hours_spent=hours + ":" + minutes;
	@Column
	private LocalDate date_completed;
	@Column
	private String status;
	
	public TrainingIdentity getTrainingIdentity() {
		return trainingIdentity;
	}
	public void setTrainingIdentity(TrainingIdentity trainingIdentity) {
		this.trainingIdentity = trainingIdentity;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	public Float getHours_spent() {
		return hours_spent;
	}
	public void setHours_spent(Float hours_spent) {
		this.hours_spent = hours_spent;
	}
	public LocalDate getDate_completed() {
		return date_completed;
	}
	public void setDate_completed(LocalDate date_completed) {
		this.date_completed = date_completed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
