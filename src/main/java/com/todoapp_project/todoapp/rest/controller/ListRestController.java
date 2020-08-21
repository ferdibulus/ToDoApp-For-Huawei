package com.todoapp_project.todoapp.rest.controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todoapp_project.todoapp.dto.ListDto;
import com.todoapp_project.todoapp.service.ListService;


@RestController
@RequestMapping("/HomePage")
public class ListRestController {
	
	
	private ListService listService;
	
	
	public ListRestController() {
		
	}
	
	public ListRestController(ListService listService) {
		super();
		this.listService = listService;
	}

	@ModelAttribute("list")
    public ListDto listDto() {
        return new ListDto();
    }
	
	
	@PostMapping
	public ModelAndView saveList(@ModelAttribute("list") ListDto listDto) {
			listService.saveList(listDto);
			 ModelAndView modelAndView = new ModelAndView();
			    modelAndView.setViewName("HomePage");
				return modelAndView;
	}
	
}
