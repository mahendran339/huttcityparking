package com.jwt.service;

import java.util.List;

import com.jwt.model.ParkingDetails;
import com.jwt.model.UserLogin;

public interface EmployeeService {

	void Userinsert(UserLogin user);

	UserLogin validateLogin(String username, String password);

	void carinsert(ParkingDetails parking);
	
	
}
