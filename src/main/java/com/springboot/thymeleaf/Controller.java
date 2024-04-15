package com.springboot.thymeleaf;

import org.apache.catalina.filters.ExpiresFilter.XServletOutputStream;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")    
	public String index()  
	{    
	return"index";    
	}   
	
	@RequestMapping(value="/save", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute User user)  
	{    
	System.out.println(user.toString());
	ModelAndView modelAndView = new ModelAndView();    
	modelAndView.setViewName("user-data");        
	modelAndView.addObject("user", user);      
	return modelAndView;    
	}    
	
}
