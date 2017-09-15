package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String user_id;
	
	@Column
	private String car_number;
	
	@Column
	private String parking_area;
	
	@Column
	private String time_limt;
	
	@Column
	private String cost_estimation;
	
	@Column
	private String reference_number;
	
	

	public String getReference_number() {
		return reference_number;
	}

	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public String getParking_area() {
		return parking_area;
	}

	public void setParking_area(String parking_area) {
		this.parking_area = parking_area;
	}

	public String getTime_limt() {
		return time_limt;
	}

	public void setTime_limt(String time_limt) {
		this.time_limt = time_limt;
	}

	public String getCost_estimation() {
		return cost_estimation;
	}

	public void setCost_estimation(String cost_estimation) {
		this.cost_estimation = cost_estimation;
	}

			
	
}
