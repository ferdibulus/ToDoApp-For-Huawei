package com.todoapp_project.todoapp.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todoapp_project.todoapp.dto.UserRegistrationDto;
import com.todoapp_project.todoapp.service.UserService;



@RestController
@RequestMapping("/Register")
public class UserRegistrationRestController {

	private UserService userService;

	public UserRegistrationRestController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	
	@GetMapping
	public ModelAndView open() {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("Register");
	    return modelAndView;
	}
		
	@PostMapping
	public ModelAndView saveUser(@ModelAttribute("user") UserRegistrationDto registrationDto) {
			userService.save(registrationDto);
			 ModelAndView modelAndView1 = new ModelAndView();
			    modelAndView1.setViewName("redirect:/Register?success");
				return modelAndView1;
	}
}
