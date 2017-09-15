package com.jwt.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.ParkingDetails;
import com.jwt.model.UserLogin;
import com.jwt.service.EmployeeService;

@Controller
public class RegisterController {

	private static final Logger logger = Logger
			.getLogger(RegisterController.class);

	public RegisterController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private EmployeeService userservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String  gethome(Model model, HttpSession httpSession,HttpServletRequest request) {
		
		return "home";
	}
		
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView  getCountsries(Model model, HttpSession httpSession,HttpServletRequest request) {
		
		System.out.println("register post-----");
		
		
		 String firstname=request.getParameter("firstname");
		 String lastname=request.getParameter("lastname");
		 String username=request.getParameter("username");
		 String email=request.getParameter("email");
		 String password=request.getParameter("password");
		 String confirm_password=request.getParameter("confirm_password");
		 
		 UserLogin user =null;
		 
		 user = new UserLogin();
		 user.setLasttname(firstname);
		 user.setLasttname(lastname);
		 user.setUsername(username);
		 user.setEmail(email);
		 user.setPassword(password);
		 user.setPassword(confirm_password);
		 ModelAndView modelAndView = new ModelAndView();
		 if(firstname != null && lastname != null && username != null && email != null && password != null && confirm_password != null){
			 userservice.Userinsert(user);
			
			 modelAndView.setViewName("Successlogin");
			 modelAndView.addObject("username", username);
			
		 }else{
			
			 modelAndView.setViewName("home");
			 
			
		 }
		 return modelAndView;
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody ModelAndView  getlogin(Model model, HttpSession httpSession,HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserLogin isValidUser = userservice.validateLogin(username, password);
		 System.out.println(isValidUser+"----");
		 
		 ModelAndView modelAndView = new ModelAndView();
		 
		 if(isValidUser != null){
			
			  
			    httpSession.setAttribute("loginuser", isValidUser);
			   
			    
			 modelAndView.setViewName("Successlogin");
			 modelAndView.addObject("username", username);
		 }else{
			 modelAndView.setViewName("home");
		 }
		
		return modelAndView;
	
}
	
	@RequestMapping(value = "/parking", method = RequestMethod.POST)
	public ModelAndView  getCardeails(Model model, HttpSession httpSession,HttpServletRequest request) {
		 UserLogin user = (UserLogin) httpSession.getAttribute("loginuser");
		 String car_number=request.getParameter("car_number");
		 String parking_area=request.getParameter("parking_area");
		 String time_limt=request.getParameter("time");
		 String cost_estimation=request.getParameter("cost");
		System.out.println(user+"  username  ");
		 System.out.println(car_number+""+parking_area + "    " +time_limt +"   "+ cost_estimation +"  "+ user.getUsername());
	
		 ParkingDetails parking = new ParkingDetails();
		 parking.setCar_number(car_number);
		 parking.setParking_area(parking_area);
		 parking.setTime_limt(time_limt);
		 parking.setCost_estimation(cost_estimation);
		 parking.setUser_id(user.getUsername());
		 
		    Date dNow = new Date();
	        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
	        String datetime = "A"+ft.format(dNow);
		    System.out.println(datetime+"-----");
		    parking.setReference_number(datetime);
		    
		  
			ModelAndView modelAndView = new ModelAndView();
		   
		 userservice.carinsert(parking);
		  modelAndView.setViewName("confirm");
		  modelAndView.addObject("datetime", datetime);
		return modelAndView;
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView  logout(Model model, HttpSession httpSession,HttpServletRequest request) {
		httpSession.removeAttribute("loginuser");
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("home");
		
		return modelAndView;
	
	}
}