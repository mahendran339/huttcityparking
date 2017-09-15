package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.jwt.dao.EmployeeDAO;
import com.jwt.model.ParkingDetails;
import com.jwt.model.UserLogin;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO userdao; 
	@Override
	public void Userinsert(UserLogin user) {
		
		userdao.adduser(user);
	}
	@Override
	public UserLogin validateLogin(String username, String password) {
		
		
		return userdao.userlogin(username ,password);
	}
	@Override
	public void carinsert(ParkingDetails parking) {
		
		 userdao.carinsert(parking);
		
	}

	
}
