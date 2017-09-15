package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.ParkingDetails;
import com.jwt.model.UserLogin;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(UserLogin employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	@Override
	public void adduser(UserLogin user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}

	@Override
	public UserLogin userlogin(String username, String password) {
		try{
			UserLogin userData=(UserLogin)sessionFactory.getCurrentSession().createQuery("select u from UserLogin u  where u.username=:username and u.password=:password")    
					 .setParameter("username", username)
					 .setParameter("password", password)
					 .uniqueResult();
			if(userData != null){
				return userData;
			}
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Object carinsert(ParkingDetails parking) {
		sessionFactory.getCurrentSession().saveOrUpdate(parking);
		
		return true;
	}


}