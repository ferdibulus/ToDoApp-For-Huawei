package com.todoapp_project.todoapp.service;

import com.todoapp_project.todoapp.dto.ListDto;
import com.todoapp_project.todoapp.entity.List;

public interface ListService  {
	List saveList(ListDto listDto);

}
