package com.jwt.dao;

import java.util.List;

import com.jwt.model.ParkingDetails;
import com.jwt.model.UserLogin;

public interface EmployeeDAO {

	void adduser(UserLogin user);

	UserLogin userlogin(String username, String password);

	Object carinsert(ParkingDetails parking);

	
}
