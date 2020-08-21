package com.todoapp_project.todoapp.service;

import org.springframework.stereotype.Service;

import com.todoapp_project.todoapp.dao.ListDao;
import com.todoapp_project.todoapp.dto.ListDto;
import com.todoapp_project.todoapp.entity.List;

@Service
public class ListServiceImpl implements ListService {

	private ListDao listDao;
	
	@Override
	public List saveList(ListDto listDto) {
		List list = new List(listDto.getListName());
		return listDao.save(list) ;
	}
	
	

}
