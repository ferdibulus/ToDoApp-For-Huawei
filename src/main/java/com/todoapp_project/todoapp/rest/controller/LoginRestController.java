package com.todoapp_project.todoapp.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginRestController {
		
	@GetMapping("/Login")
	public ModelAndView open() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("Login");
	    return modelAndView;
	}
	
	
	@RequestMapping("/")
	public ModelAndView openLogin() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("HomePage");
	    return modelAndView;
	}
	
	@GetMapping("/HomePage")
	public ModelAndView open1() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("HomePage");
	    return modelAndView;
	}
	
	@GetMapping("/ToDoList")
	public ModelAndView open2() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("ToDoList");
	    return modelAndView;
	}
	
	@GetMapping("/Profile")
	public ModelAndView open3() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("Profile");
	    return modelAndView;
	}

}